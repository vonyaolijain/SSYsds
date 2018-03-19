
package com.xxgc.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxgc.bean.Department;
import com.xxgc.service.DepartmentService;

@Controller

public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	@Autowired
	Department department;

	@RequestMapping(value = "de_getAll")
	public String getAll(Model model) {
		List<Department> list = departmentService.getAll();
		model.addAttribute("departmentList", list);
		model.addAttribute("size", list.size());

		return "department_findall";
	}

	@RequestMapping(value = "de_delete")
	public String delete(@Param(value = "deid") Integer deid, Model model) {
		departmentService.delete(deid);
		System.out.println("succscc");
		return "redirect:de_getAll";
	}

	@RequestMapping(value = "de_edit")
	public String delete(@Param(value = "departmentname") String departmentname, @Param(value = "ddesc") String ddesc,
			@Param(value = "deid") Integer deid) {
		department.setDepartmentname(departmentname);
		department.setDdesc(ddesc);
		if (deid == null) {
			departmentService.add(department);
		} else {
			department.setDeid(deid);
			departmentService.update(department);
		}

		return "redirect:de_getAll";
	}

	@RequestMapping(value = "de_findid")
	public String findid(@Param(value = "deid") Integer deid, Model model) {

		department = departmentService.finfid(deid);
		model.addAttribute("department", department);
		return "department_edit";
	}

	
}
