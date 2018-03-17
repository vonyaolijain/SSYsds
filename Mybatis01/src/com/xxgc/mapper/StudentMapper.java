package com.xxgc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxgc.bean.Student;

public interface StudentMapper {
public Student findbyid(Integer id);
public void StuAdd(Student student);
public void StuUpd(Student studnet);
public void StuDel(Integer id);
public Student findidandname(@Param(value="id") Integer id,@Param(value="name") String name);

public List<Student> findmh(String name);
public Student findall(Integer id);
public Student findalls(Integer id);
public List<Student> findcid(Integer id);

}
