package com.zjc.dao;

import java.util.Map;

import com.zjc.model.SignUp;

public interface ISignUpDao {
	public SignUp selectByUserName(String userName);
	public int insertSignUp(SignUp signUp);
	public int deleteSignUpByStuNo(String stuNo);
	public int updateSignUp(Map map);
}
