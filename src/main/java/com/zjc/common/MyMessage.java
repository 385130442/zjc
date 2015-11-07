package com.zjc.common;

public class MyMessage {
	private int code;
	private String message;
	public MyMessage() {
		super();
	}
	public MyMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MyMessage [code=" + code + ", message=" + message + "]";
	}
}
