package com.xxgc.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.glass.ui.Application;
import com.xxgc.bean.Employee;
import com.xxgc.dao.EmployeeDAO;
import com.xxgc.dao.ManagerDAO;

/**
 * Servlet implementation class ManagerServlet
 */
@WebServlet("/ManagerServlet")
public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public static int count=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		if(type.equals("login")){
			login(request,response);	
		}
		if(type.equals("quit")){
			quit(request,response);
		}
		if(type.equals("quits")){
			quits(request,response);
		}
	}

	private void quits(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ServletContext application=this.getServletContext();
		int count=(int) application.getAttribute("count");


		System.out.println("quits 1:"+count);
		count--;
		application.setAttribute("count", count);
			System.out.println("quuts 2:"+count);
			response.sendRedirect("login.jsp");
		
	}

	public  void quit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	HttpSession session =request.getSession();
	session.invalidate();
ServletContext application=this.getServletContext();
int count=(int) application.getAttribute("count");


System.out.println("count quit 1:"+count);
count--;
application.setAttribute("count", count);
	System.out.println("count quit 2:"+count);
	response.sendRedirect("login.jsp");
	
	}

	public  void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		ManagerDAO managerDAO=new ManagerDAO();
		boolean flag=managerDAO.login(username, password);
        EmployeeDAO employeeDAO=new EmployeeDAO();
		if(flag==true){
			Employee employee=employeeDAO.findbyname(username);
			
			count++;
			HttpSession session =request.getSession();
	/*	session.setAttribute("purl", employee.getPurl());
		System.out.println(employee.getPurl());*/
			session.setAttribute("username", username);
			session.setAttribute("password",password);
		    ServletContext application=this.getServletContext();
			
			application.setAttribute("count", count);
			//session.setMaxInactiveInterval(10);设置session过期时间
			
			response.sendRedirect("background/index.jsp");
		}else{
		response.sendRedirect("login.jsp");
		}
		
	}

}
