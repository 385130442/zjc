package com.zjc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zjc.model.Student;
import com.zjc.service.impl.StudentService;

@Controller
public class LoginController {
	@Autowired
	StudentService studentService;
	@RequestMapping(value="/")
	public String login(){
		return "index";
	}
	
//	@ResponseBody
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public Object obj(String username,String password,HttpServletRequest req,HttpServletResponse resp){
//		String reason = "用户名/密码错误";
//		int id=0;
//		if(username!=""&&username!=null){
//			Student s = studentService.selectByUsername(username);
//			if(s!=null){
//				if(s.getPassword().equals(password)){
//					reason="成功";
//					id=s.getId();
//				}
//			}
//		}
//		ArrayList list =new ArrayList();
//		list.add(reason);
//		list.add(id);
//		JSONArray json = JSONArray.fromObject(list);
//		return json;
//	}
}
