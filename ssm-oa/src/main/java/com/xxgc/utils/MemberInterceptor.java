package com.xxgc.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xxgc.bean.Employee;
import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.service.*;

public class MemberInterceptor implements HandlerInterceptor {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	RoleService roleService;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse respinse, Object arg2) throws Exception {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("ddd");

		Employee employee = employeeService.login(username, password);

		if (employee != null) {
			int rid = employee.getRid();
			System.out.println(rid);
			Role role = roleService.logins(rid);
			System.out.println(role);
			employee.setRole(role);
			System.out.println(employee);

			HttpSession session = request.getSession();
			session.setAttribute("employee", employee);
			return true;
		}

		respinse.sendRedirect("login.jsp");
		return false;

	}

}
