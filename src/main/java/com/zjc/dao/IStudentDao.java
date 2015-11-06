package com.zjc.dao;

import java.util.List;

import com.zjc.model.Student;

public interface IStudentDao {
	public Student selectByUserName(String userName);
	public List<Student> selStudent(int offset,int limit);
	public int selStudentNum();
	public int insertStudent(Student student);
}
