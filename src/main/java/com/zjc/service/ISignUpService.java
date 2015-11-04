package com.zjc.service;

import com.zjc.model.SignUp;

public interface ISignUpService {
	public SignUp selectByUsername(String userName);
	public int insertSignUp(SignUp signUp);
}
