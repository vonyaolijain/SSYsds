package com.xxgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Department;
import com.xxgc.bean.Employee;
import com.xxgc.dao.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee login(String username, String password) {

		return employeeMapper.login(username, password);
	}

	// finfall
	public List<Employee> getAll() {
		return employeeMapper.selectByExamplede(null);
	}

	// findid
	public Employee finfid(Integer id) {
  
		return employeeMapper.selectByPrimaryKeyde(id);
	}

	public void add(Employee employee) {
		employeeMapper.insert(employee);
		
	}

	public void update(Employee employee) {
		employeeMapper.updateByPrimaryKey(employee);
		
	}

	public void delete(Integer id) {
	employeeMapper.deleteByPrimaryKey(id);
		
	}

}
