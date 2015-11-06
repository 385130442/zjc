package com.zjc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zjc.common.MyMessage;
import com.zjc.model.SignUp;
import com.zjc.service.impl.SignUpService;

@Controller
@RequestMapping(value="/SignUp")
public class SignUpController {
	@Autowired
	SignUpService signUpService;
	//用户名和学号要唯一。
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp,String userName,
	String stuNo,String name,String promise){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SignUp/add");
		int code=-1;
		String message = "失败";
		MyMessage mes = new MyMessage(code, message);
		//判断用户名是否可用
		if(userName==null||userName.trim().isEmpty()||signUpService.selectByUserName(userName)==null){
			mav.addObject("mes", mes);
			return mav;
			//判断学号是否可用
		}else if(signUpService.selectByUserName(userName).getStuNo().equals(stuNo)){
			mav.addObject("mes", mes);
			return mav;
		}
		long time = System.currentTimeMillis();
		SignUp signUp = new SignUp(userName, stuNo, name, promise, time, time);
		int num = signUpService.insertSignUp(signUp);
//		new SignUp("zjccc", "java-l1-t1", "隔壁小张", "像xd一样纯洁", time, time)
		if(num>0){
			message = "成功";
			code=0;
			mes = new MyMessage(code, message);
		}
		
		
		mav.addObject("mes", mes);
		return mav;
		
	}
	@RequestMapping(value="/look")
	public ModelAndView look(HttpServletRequest req,HttpServletResponse resp,String userName){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SignUp/look");
		
		int code=-1;
		String message ="失败";
		MyMessage mes = new MyMessage(code, message);
		mav.addObject("mes",mes);
		SignUp signUp = signUpService.selectByUserName(userName);
		if(signUp!=null){
			code=0;
			message="成功";
			mes = new MyMessage(code, message);
		}
		
		mav.addObject("signUp",signUp);
		mav.addObject("mes", mes);
		return mav;
	}
	@RequestMapping(value="/delete")
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse resp,String userName,String stuNo){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SignUp/delete");
		MyMessage mes = new MyMessage();
		int code=-1;
		String message="错误";
		SignUp signUp = signUpService.selectByUserName(userName);
		if(signUp==null){
			mes.setCode(code);
			mes.setMessage(message);
		}else if(!signUp.getStuNo().equals(stuNo)){
			mes.setCode(code);
			mes.setMessage(message);
		}else{
			signUpService.deleteSignUpByStuNo(stuNo);
			code=0;
			mes.setCode(code);
			message="成功";
			mes.setMessage(message);
		}
		mav.addObject("mes", mes);
		return mav;
	}
//	update SIGNUP set stuNo=#{lastStuNo},name=#{name},promise=#{promise},updateAt=#{updateAt}
//	where  stuNo=#{firstStuNo}
	@RequestMapping(value="/update")
	public ModelAndView update(HttpServletRequest req,HttpServletResponse resp,String userName,String firstStuNo,
	String	lastStuNo,String name,String promise	){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SignUp/update");
		int code=-1;
		String message="错误";
		MyMessage mes = new MyMessage(code,message);
		mav.addObject("mes", mes);
		SignUp signUp = signUpService.selectByUserName(userName);
		Map map =new HashMap();
		long time = System.currentTimeMillis();
		map.put("firstStuNo", firstStuNo);
		map.put("lastStuNo", lastStuNo);
		map.put("name", name);
		map.put("promise", promise);
		map.put("update", time);
		//判断用户名和修改前的学号是否有效
		if(signUp==null){
			return mav;
		}else if(!signUp.getStuNo().equals(firstStuNo)){
			return mav;
		}
		int num = signUpService.updateSignUp(map);
		//是否更新成功
		if(num>0){
			code=0;
			message="成功";
			mes.setCode(code);
			mes.setMessage(message);
			mav.addObject("mes", mes);
			mav.addObject("signUp", signUp);
			return mav;
		}else{
			return mav;
		}
		
	}
		
}
