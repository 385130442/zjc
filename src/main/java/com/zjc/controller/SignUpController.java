package com.zjc.controller;

import java.util.ArrayList;
import java.util.List;

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
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp,String userName,
	String stuNo,String name,String promise){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SignUp/add");
		int code=-1;
		String message = "失败";
		MyMessage mes = new MyMessage(code, message);
		
		if(userName==null||userName.trim().isEmpty()||signUpService.selectByUsername(userName)!=null){
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
		SignUp signUp = signUpService.selectByUsername(userName);
		if(signUp!=null){
			code=0;
			message="成功";
			mes = new MyMessage(code, message);
		}
		
		mav.addObject("signUp",signUp);
		mav.addObject("mes", mes);
		return mav;
	}
}
