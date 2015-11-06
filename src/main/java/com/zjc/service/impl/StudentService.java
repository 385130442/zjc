package com.zjc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjc.dao.IStudentDao;
import com.zjc.model.Student;
import com.zjc.service.IStudentService;
@Service(value="StudentService")
public class StudentService implements IStudentService{
	@Autowired
	IStudentDao studentDao;
	public Student selectByUsername(String userName) {
		return studentDao.selectByUserName(userName);
	}

	public int selStudentNum() {
		return studentDao.selStudentNum();
	}

	public int insertStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	public List<Student> selStudent(int offset, int limit) {
		return studentDao.selStudent(offset, limit);
	}

}
