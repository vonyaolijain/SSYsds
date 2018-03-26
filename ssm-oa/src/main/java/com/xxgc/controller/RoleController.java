
package com.xxgc.controller;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxgc.bean.Department;
import com.xxgc.bean.Lianhe;
import com.xxgc.bean.Power;
import com.xxgc.bean.Prteam;
import com.xxgc.bean.Role;
import com.xxgc.service.DepartmentService;
import com.xxgc.service.PowerService;
import com.xxgc.service.PrteamService;
import com.xxgc.service.RoleService;

@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	Role role;
	@Autowired
	PowerService powerService;
	@Autowired
	PrteamService prteamService;

	@RequestMapping(value = "ro_getAll")
	public String getAll(Model model) {
		List<Role> list = roleService.getAll();
		model.addAttribute("roleList", list);
		model.addAttribute("size", list.size());

		return "role_findall";
	}

	@RequestMapping(value = "ro_getpo")
	public String getApo(Model model, @Param(value = "id") Integer id) {
		System.out.println("id" + id);

		List<Power> powerList = powerService.getAll();
		List<Lianhe> prteamList = prteamService.getAll(id);
		System.out.println("sst"+prteamList);
		List<Power> powerlist = role.getPower();

		model.addAttribute("id", id);
		model.addAttribute("powerlist", powerlist);// 角色拥有的权限
		model.addAttribute("powerList", powerList);// 该系统全部权限
		model.addAttribute("prteamList", prteamList);//角色 权限 连接表信息 Lianhe bean
		return "role_power";
	}
	
	
	
	@RequestMapping(value = "add_rolepower")
	public String findp(Model model,@Param(value="id") Integer id) {
		List<Power> list = roleService.findp(id);
		System.out.println("sssf"+list);
		model.addAttribute("powerList", list);
	    model.addAttribute("rid", id);

		return "power_list";
	}
	
	
	
	
	

	/*
	 * @RequestMapping(value = "de_delete") public String delete(@Param(value =
	 * "deid") Integer deid, Model model) { departmentService.delete(deid);
	 * System.out.println("succscc"); return "redirect:de_getAll"; }
	 * 
	 * @RequestMapping(value = "de_edit") public String delete(@Param(value =
	 * "departmentname") String departmentname, @Param(value = "ddesc") String
	 * ddesc,
	 * 
	 * @Param(value = "deid") Integer deid) {
	 * department.setDepartmentname(departmentname); department.setDdesc(ddesc);
	 * System.out.println("id"+ deid); if (deid == null) {
	 * System.out.println("add"); departmentService.add(department); } else {
	 * System.out.println("update"); department.setDeid(deid);
	 * departmentService.update(department); }
	 * 
	 * return "redirect:de_getAll"; }
	 * 
	 * @RequestMapping(value = "de_findid") public String findid(@Param(value =
	 * "deid") Integer deid, Model model) {
	 * 
	 * department = departmentService.finfid(deid);
	 * model.addAttribute("department", department); return "department_edit"; }
	 */

}
