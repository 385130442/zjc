package com.zjc.dao;

import com.zjc.model.SignUp;

public interface ISignUpDao {
	public SignUp selectByUsername(String userName);
	public int insertSignUp(SignUp signUp);
}
