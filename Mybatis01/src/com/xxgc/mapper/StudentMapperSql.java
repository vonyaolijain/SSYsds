package com.xxgc.mapper;

import java.util.List;

import com.xxgc.bean.Student;

public interface StudentMapperSql {
	public List<Student> find(Student student);
}
