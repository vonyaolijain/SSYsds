
package com.xxgc.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxgc.bean.Department;
import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.service.DepartmentService;
import com.xxgc.service.PowerService;
import com.xxgc.service.RoleService;

@Controller
public class PowerController {
	@Autowired
	private PowerService powerService;
	
	

	@RequestMapping(value = "po_getAll")
	public String getAll(Model model) {
		List<Power> list = powerService.getAll();
		model.addAttribute("powerList", list);
		model.addAttribute("size", list.size());

		return "power_findall";
	}

	/*@RequestMapping(value = "de_delete")
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
		System.out.println("id"+ deid);
		if (deid == null) {
			System.out.println("add");
			departmentService.add(department);
		} else {
			System.out.println("update");
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
*/
	
}
