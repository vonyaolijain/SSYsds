package com.xxgc.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet  implements Servlet{
	static int count=0;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	 
		HttpServletRequest Httpservletrequest=(HttpServletRequest) request;
		HttpServletResponse httpservletresponse=(HttpServletResponse) response;
		String username= Httpservletrequest.getParameter("user");
		 String password =Httpservletrequest.getParameter("passwd");
		 HttpSession session = ((HttpServletRequest) request).getSession();//û��Session���½�һ�� 
		 
		 session.setAttribute("username", username);

		count++;
		session.setAttribute("count", count);
		
	//�ڷ������˴洢"��-ֵ��" 
		/*if(username.equals("root")&&password.equals("sa")){
			httpservletresponse.sendRedirect("background/index.jsp");
		}else{
			httpservletresponse.sendRedirect("login.jsp");
		}*/
		httpservletresponse.sendRedirect("background/index.jsp");
	}

}
