package com.zjc.service;

import java.util.List;


import com.zjc.model.Student;

public interface IStudentService {
	public Student selectByUsername(String userName);
	public List<Student> selStudent(int offset,int limit);
	public int selStudentNum();
	public int insertStudent(Student student);	
}
