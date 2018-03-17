package com.xxgc.filter;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxgc.bean.Employee;
import com.xxgc.dao.EmployeeDAO;

public class PowerFilter  implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
          HttpServletRequest re=(HttpServletRequest) request;
          HttpServletResponse rep=(HttpServletResponse) response;
	     HttpSession session=re.getSession();
	    int id=(int) session.getAttribute("id");
	   /* int id=Integer.parseInt(ids);*/
	    EmployeeDAO employeeDao=new EmployeeDAO();
	    Employee employee=employeeDao.findbypow(id);
	    String pname=employee.getPname();
	    System.out.println("s:"+pname);
	     if( !pname.equals("三级权限")){
	    	 rep.sendRedirect("background/power.jsp");
	     }else{
	    	 chain.doFilter(re, rep);
	     }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
