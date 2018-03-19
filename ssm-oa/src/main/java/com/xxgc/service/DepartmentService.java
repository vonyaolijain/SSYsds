package com.xxgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Department;
import com.xxgc.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;
//fidid
	public Department finfid(Integer deid){
		return departmentMapper.selectByPrimaryKey(deid);
	}
	// finfall
	public List<Department> getAll() {
		return departmentMapper.selectByExample(null);
	}

	// delete
	public void delete(Integer deid) {
		departmentMapper.deleteByPrimaryKey(deid);

	}

	// add
	public void add(Department department) {

		departmentMapper.insert(department);

	}
	//update
	public void update(Department department) {
		
	  departmentMapper.updateByPrimaryKeySelective(department);
		
	}
}
