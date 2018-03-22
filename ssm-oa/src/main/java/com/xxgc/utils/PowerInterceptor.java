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
import com.xxgc.service.EmployeeService;

public class PowerInterceptor implements HandlerInterceptor {
	@Autowired
	EmployeeService employeeService;

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
		System.out.println("the scfofn");
		String path = request.getRequestURI();
		System.out.println("当前需要权限 ：" + path);

		HttpSession session = request.getSession();
		Employee employee = (Employee) session.getAttribute("employee");
		if (employee.getRole() == null) {
			System.out.println("查询不到");
			return false;
		}
		List<Power> power = employee.getRole().getPower();

		for (Power p : power) {

			while (p.getPurl().equals(path)) {
				System.out.println("session" + employee);
				return true;

			}

		}
		return false;

	}
}