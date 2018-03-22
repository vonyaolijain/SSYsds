package com.xxgc.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxgc.bean.Department;
import com.xxgc.bean.Employee;
import com.xxgc.bean.Role;
import com.xxgc.service.DepartmentService;
import com.xxgc.service.EmployeeService;
import com.xxgc.service.RoleService;

/**
 * @author Administrator
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	Employee employee;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	RoleService roleService;

	/**
	 * 登录
	 */
	@RequestMapping(value = "login")
	public String login() {
		return "index";
	}

	/**
	 * 员工全查
	 */
	@RequestMapping(value = "em_getAll")
	public String getAll(Model model) {
		List<Employee> list = employeeService.getAll();
		model.addAttribute("employeeList", list);
		model.addAttribute("size", list.size());
		System.out.println(list);
		return "employee_findall";
	}

	@RequestMapping(value = "em_findid")
	public String findid(@Param(value = "id") Integer id, Model model) {
		employee = employeeService.finfid(id);
		List<Department> departmentList = departmentService.getAll();
		List<Role> roleList = roleService.getAll();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("roleList", roleList);
		model.addAttribute("employee", employee);
		return "employee_edit";
	}

	@RequestMapping(value = "em_edit")
	public String delete(Employee employee) {
		System.out.println("34" + employee);
		if (employee.getId() == null) {
			System.out.println("add");
			employeeService.add(employee);
		} else {
			System.out.println("update");

			employeeService.update(employee);
		}

		return "redirect:em_getAll";
	}

	@RequestMapping(value = "em_add")
	public String add(Model model) {
		List<Department> departmentList = departmentService.getAll();
		List<Role> roleList = roleService.getAll();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("roleList", roleList);
		return "employee_edit";
	}

	@RequestMapping(value = "em_delete")
	public String delete(@Param(value = "id") Integer id) {
		employeeService.delete(id);
		return "redirect:em_getAll";
	}
}
