package com.zjc.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjc.dao.ISignUpDao;
import com.zjc.model.SignUp;
import com.zjc.service.ISignUpService;
@Service(value="SignUpService")
public class SignUpService implements ISignUpService {
	@Autowired
	ISignUpDao signUpDao;
	public SignUp selectByUserName(String userName) {
		return signUpDao.selectByUserName(userName);
	}

	public int insertSignUp(SignUp signUp) {
		return signUpDao.insertSignUp(signUp);
		
	}

	public int deleteSignUpByStuNo(String stuNo) {
		return signUpDao.deleteSignUpByStuNo(stuNo);
	}

	public int updateSignUp(Map map) {
		return signUpDao.updateSignUp(map);
	}

}
