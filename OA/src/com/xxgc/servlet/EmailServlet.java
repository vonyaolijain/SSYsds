package com.xxgc.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.CommonDialogs.Type;
import com.xxgc.bean.Email;
import com.xxgc.bean.Employee;
import com.xxgc.dao.EmailDAO;
import com.xxgc.dao.EmployeeDAO;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmailServlet() {
        super();
      
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
	 if(type.equals("findallem")){
		 findallem(request,response);
	 }
	 if(type.equals("add")){
		add(request,response);
	 }
	}

	public void add(HttpServletRequest request, HttpServletResponse response) {
	
	String eid=request.getParameter("eid");
	System.out.println(eid);
	String eids=request.getParameter("eids");
	System.out.println("ss"+eids);
	String etitle=request.getParameter("etitle");
	String econtent=request.getParameter("econtent");
	int eidu=Integer.parseInt(eid);
	int eidsu=Integer.parseInt(eids);
	System.out.println("eidu"+eidu);
	System.out.println("eidu"+eidsu);
	Date date=new Date();
	SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String etime=si.format(date);
	System.out.println(etime);
	int estate=0;//Î´¶Á
	Email e=new Email(etitle, econtent, etime,estate , eidu, eidsu);
	EmailDAO emailDAO=new EmailDAO();
	emailDAO.add(e);
	System.out.println("success");
	}

	public void findallem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO employeeDAO=new EmployeeDAO();
		List<Employee> employeeList=employeeDAO.Findallem();
		request.setAttribute("employeeList", employeeList);
		request.getRequestDispatcher("background/email_add.jsp").forward(request, response);
	}

}
