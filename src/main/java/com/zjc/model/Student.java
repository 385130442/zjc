package com.zjc.model;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String userName;//用户名
	private String password;
	private String nickName;//昵称
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + userName + ", password="
				+ password + ", nickName=" + nickName + "]";
	}


	
	
	
}
