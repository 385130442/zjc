package com.zjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjc.dao.ISignUpDao;
import com.zjc.model.SignUp;
import com.zjc.service.ISignUpService;
@Service(value="SignUpService")
public class SignUpService implements ISignUpService {
	@Autowired
	ISignUpDao signUpDao;
	public SignUp selectByUsername(String userName) {
		return signUpDao.selectByUsername(userName);
	}

	public int insertSignUp(SignUp signUp) {
		return signUpDao.insertSignUp(signUp);
		
	}

}
