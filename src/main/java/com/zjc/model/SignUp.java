package com.zjc.model;

public class SignUp {
	private int id;
	private String userName;//用户名
	private String stuNo;//学号
	private String name;//真实姓名
	private String promise;	
	private long createAt ;
	private long updateAt;
	
	
	public SignUp() {
		super();
	}
	public SignUp(String userName, String stuNo, String name,
			String promise, long createAt, long updateAt) {
		super();
		
		this.userName = userName;
		this.stuNo = stuNo;
		this.name = name;
		this.promise = promise;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getCreateAt() {
		return createAt;
	}
	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}
	public long getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPromise() {
		return promise;
	}
	public void setPromise(String promise) {
		this.promise = promise;
	}
	@Override
	public String toString() {
		return "SignUp [id=" + id + ", userName=" + userName + ", createAt="
				+ createAt + ", updateAt=" + updateAt + ", stuNo=" + stuNo
				+ ", name=" + name + ", promise=" + promise + "]";
	}
	
}
