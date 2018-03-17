package com.xxgc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxgc.bean.Department;
import com.xxgc.dao.DepartmentDAO;

/**
 * Servlet implementation class DepartmentServlet
 */
@WebServlet("/DepartmentServlet")
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServlet() {
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
		if(type.equals("Findall")){
			Findall(request,response);
		}
			
		if(type.equals("delete")){
			delete(request,response);
		}
		if(type.equals("edit")){
			edit(request,response);
		}
		if(type.equals("findbyid")){
			findbyid(request,response);
		}
		if(type.equals("findlist")){
			findlist(request,response);
		}
	}

 private void findlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	System.out.println("zzs");
		request.getRequestDispatcher("background/department_edit.jsp").forward(request, response);
	}

private void findbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		Department department=new Department();
		DepartmentDAO departmetDao=new DepartmentDAO();
		department=departmetDao.findbyid(id);
		request.setAttribute("department", department);
		request.getRequestDispatcher("background/department_edit.jsp").forward(request, response);
	}

public  void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	 String ids=request.getParameter("id");
	String departmentname=request.getParameter("departmentname");
	String ddesc=request.getParameter("ddesc");
		DepartmentDAO departmentDao=new DepartmentDAO();
	if(ids.equals("")){
	
	    departmentDao.add(departmentname, ddesc);
		
	}else{
		int id=Integer.parseInt(ids);
		departmentDao.update(id, departmentname, ddesc);
	}
		request.getRequestDispatcher("DepartmentServlet?type=Findall").forward(request, response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String ids=request.getParameter("id");
		int id =Integer.parseInt(ids);
	    DepartmentDAO departmentDao=new DepartmentDAO();
	    departmentDao.delete(id);
	    request.getRequestDispatcher("DepartmentServlet?type=Findall").forward(request, response);
		
	}

	public  void Findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartmentDAO departmentDao=new DepartmentDAO();
		List<Department> departmentList=departmentDao.Findall();
		request.setAttribute("departmentList", departmentList);
		String path="background/department_findall.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

}
