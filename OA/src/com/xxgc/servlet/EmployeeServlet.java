package com.xxgc.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.apache.naming.SelectorContext;

import com.xxgc.bean.Department;
import com.xxgc.bean.Employee;
import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.dao.DepartmentDAO;
import com.xxgc.dao.EmployeeDAO;
import com.xxgc.dao.ManagerDAO;
import com.xxgc.dao.PowerDAO;
import com.xxgc.dao.RoleDAO;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String type=request.getParameter("type");
	     if(type.equals("login")){
	    	 login(request,response);
	     }
		if(type.equals("Findall")){
			Findall(request,response);
		}
	    if(type.equals("edit")){
	    	edit(request,response);
	    }
	    if(type.equals("delete")){
	    	delete(request,response);
	    }
	    if(type.equals("findbyid")){
	    	findbyid(request,response);
	    }
	    if(type.equals("pow")){
	    	pow(request,response);
	    }
	    if(type.equals("findlist")){
	    	findlist(request,response);
	    }
	    
	}
 
  public  void findlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	  DepartmentDAO departmentDao=new DepartmentDAO();
	  PowerDAO powerDao=new PowerDAO();
	  RoleDAO roleDao=new RoleDAO();
	  List<Department> departmentList=departmentDao.Findall();
	   List<Power> powerList=powerDao.findall();
	   List<Role>  roleList=roleDao.findall();
	   request.setAttribute("departmentList", departmentList);
	   request.setAttribute("powerList", powerList);
	   request.setAttribute("roleList", roleList);
	   request.getRequestDispatcher("background/employee_edit.jsp").forward(request, response);
	}

   private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session =request.getSession();
		EmployeeDAO employeeDao=new EmployeeDAO();
		boolean flag=employeeDao.login(username, password);
		 ServletContext application=this.getServletContext();
		 String user=(String) session.getAttribute("username");
		 int countlist=employeeDao.count();
		 System.out.println("count login 0£º"+count);
		 if(user!=null){
			count=(int) application.getAttribute("count");
			 System.out.println("count login 0£º"+count);
			count++;
			 System.out.println("count login 0£º"+count);
			  application.setAttribute("count", count);
			response.sendRedirect("background/index.jsp");
		 }
		 
		   else{
			 
			         if(flag==true){
			         if(application.getAttribute("count")==null){
		             System.out.println("zz");
			          count=0;
							
						}else if(application.getAttribute("count")!=null){
							System.out.println("mzm");
							count=(int) application.getAttribute("count");
						}
						System.out.println("count login£º"+count);
						count++;
					    System.out.println("count logins£º"+count);
					
						SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date dates=new Date();
						String dd=si.format(dates);
						System.out.println(dd);
						
						Employee employee=employeeDao.findbyname(username);
					
						session.setAttribute("username", username);
						session.setAttribute("password",password);
					    session.setAttribute("id",employee.getId());
				        session.setAttribute("employee", employee);
				        session.setAttribute("countlist", countlist);
				        application.setAttribute("count", count);
				        response.sendRedirect("background/index.jsp");
				}
				 
				 else{
					response.sendRedirect("login.jsp");
				} 
				
			 } 
			
		 }
		
  
private void pow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String  id=request.getParameter("id");
	   int ids=Integer.valueOf(id);
	   EmployeeDAO employeeDao=new EmployeeDAO();
		//List<Employee> employeeList= employeeDao.findbypow(ids);
		//request.setAttribute("employeeList", employeeList);
		request.getRequestDispatcher("/background/power.jsp").forward(request, response);
	}

public  void findbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  EmployeeDAO employeeDao=new EmployeeDAO();
	  DepartmentDAO departmentDao=new DepartmentDAO();
	  PowerDAO powerDao=new PowerDAO();
	  RoleDAO roleDao=new RoleDAO();
	  String id=request.getParameter("id");
	   int ids=Integer.valueOf(id);
	
	   List<Department> departmentList=departmentDao.Findall();
	   List<Power> powerList=powerDao.findall();
	   List<Role>  roleList=roleDao.findall();
 	   List<Employee> employeeList=employeeDao.Findall();
		
	   Employee employee=  employeeDao.findbyid(ids);
	   request.setAttribute("employee", employee);
	   request.setAttribute("employeeList", employeeList);
	   request.setAttribute("departmentList", departmentList);
	   request.setAttribute("powerList", powerList);
	   request.setAttribute("roleList", roleList);

	   request.getRequestDispatcher("background/employee_edit.jsp").forward(request, response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		  String id=request.getParameter("id");
		  int ids=Integer.valueOf(id);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		employeeDAO.delete(ids);
		String path="EmployeeServlet?type=Findall";
		response.sendRedirect(path);
	}

	public void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String path = null;
		EmployeeDAO employeeDao=new EmployeeDAO();
		 String name=request.getParameter("name");
		 String sex=request.getParameter("sex");
		String age=request.getParameter("age");
		String time=request.getParameter("time");
		String id=request.getParameter("id");
		String  deid=request.getParameter("deid");
	
		String pid=request.getParameter("pid");
		String rid=request.getParameter("rid");
	
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Employee employee=new Employee();
	  System.out.println("pid"+pid);
	  System.out.println("rid"+rid);
	    employee.setUsername(username);
	    employee.setPassword(password);
	    employee.setPid(pid);
	    employee.setRid(rid);
		employee.setName(name);
		employee.setSex(sex);
		employee.setAge(Integer.parseInt(age));
	    employee.setTime(time);
	    employee.setDeid(deid);
	   if(id.equals("")){
		
		System.out.println("world");
		employeeDao.add(employee);
		path="EmployeeServlet?type=Findall";
		System.out.println("Ìí¼Ó");
	   }
	   else{
		int ids=Integer.valueOf(id);
		employee.setId(ids);
		employeeDao.update(employee);
		path="EmployeeServlet?type=Findall";
		System.out.println("ÐÞ¸Ä");
	}
	
	 response.sendRedirect(path);
	}

	public void Findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  EmployeeDAO employeeDao=new EmployeeDAO();
	  List<Employee> employeeList=employeeDao.Findall();
		request.setAttribute("employeeList", employeeList);
		String path="background/employee_findall.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}	
}
