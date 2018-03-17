package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xxgc.bean.Employee;

import com.xxgc.conn.DBConnection;

public class EmployeeDAO {

	public Connection conn;
	public PreparedStatement ps;
	private ResultSet rs;
	
	public EmployeeDAO(){
		DBConnection db=new DBConnection();
		conn=db.conn;
	}
	
	//login
	  public boolean login(String username,String password){
		  String sql="select * from employee where username='"+username+"' and password='"+password+"'";
		  
		  try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
		
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		  
		  
		return false;
		  
	  }
	public List<Employee> Findall(){
		
		List<Employee> managers=new ArrayList<Employee>();
		String sql="select * from ((employee INNER join department ON employee.deid=department.deid) INNER join power on employee.pid=power.pid) inner join role on employee.rid=role.id";
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Employee employee=new Employee();
				employee.setId(rs.getInt(1));
				employee.setUsername(rs.getString(2));
				employee.setPassword(rs.getString(3));
				employee.setName(rs.getString(9));
				employee.setSex(rs.getString(10));
				employee.setAge(rs.getInt(4));
				employee.setTime(rs.getString(5));
				employee.setDeid(rs.getString(6));
				employee.setDepartmentname(rs.getString(12));
				employee.setPname(rs.getString(15));
				employee.setRname(rs.getString(18));
				managers.add(employee);
				
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return managers;
	}
	
	//收发邮件查询名字
public List<Employee> Findallem(){
		
		List<Employee> employees=new ArrayList<Employee>();
		String sql="select id,name from employee";
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Employee employee=new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employees.add(employee);
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return employees;
	}
	
	
	//插入
			public boolean add(Employee employee){
				String sql ="INSERT INTO employee(username,password,name,sex,age,time,deid,pid,rid) VALUES('"+employee.getUsername()+"', '"+employee.getPassword()+"',      '"+employee.getName() +"','" +employee.getSex() +"','" +employee.getAge()+"','" +employee.getTime()+"','" +employee.getDeid()+"','"+employee.getPid()+"','"+employee.getRid()+"'); ";
				
				try {
					ps=conn.prepareStatement(sql);
				    int a =ps.executeUpdate();
				    if(a>0){
				    	return true;
				    	
				    }
				
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				
				return false;
			}	
			
			/*	删除*/
			public boolean delete(int id){
				String sql =" delete from employee where id="+id;
				
				try {
					ps=conn.prepareStatement(sql);
				    int a =ps.executeUpdate();
				    if(a>0){
				    	return true;
				    }
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				return false;
			}	
			
			/*单条语句查询*/
			public Employee findbyid (int id){
				Employee employee=new Employee();
				String sql="select * from ((employee INNER join department ON employee.deid=department.deid) INNER join power on employee.pid=power.pid) inner join role on employee.rid=role.id  where employee.id="+id;
				System.out.println(sql);
				try{
					ps=conn.prepareStatement(sql);
					rs=ps.executeQuery();
					if(rs.next()){
						employee.setId(rs.getInt(1));
						employee.setUsername(rs.getString(2));
						employee.setPassword(rs.getString(3));
						employee.setRid(rs.getString(7));
						employee.setPid(rs.getString(8));
						employee.setName(rs.getString(9));
						employee.setSex(rs.getString(10));
						employee.setAge(rs.getInt(4));
						employee.setTime(rs.getString(5));
						employee.setDeid(rs.getString(6));
						employee.setDepartmentname(rs.getString(12));
						employee.setPname(rs.getString(15));
						employee.setRname(rs.getString(18));
						
					}
				}
				catch(SQLException e){
					e.printStackTrace();	
				}
				return employee;
				}
		/*	根据id查询权限
			public List<Employee> findbypow (int id){
				
				List<Employee> employeeList=new ArrayList<Employee>();
				String sql="select pname from (employee INNER JOIN sf on employee.id=sf.id ) INNER JOIN power ON power.pid=sf.pid where employee.id="+id;
			System.out.println(sql);
				try{
					ps=conn.prepareStatement(sql);
					rs=ps.executeQuery();
					while(rs.next()){
						Employee employee=new Employee();
						employee.setPname(rs.getString(1));
						employeeList.add(employee);
					}
				}
				catch(SQLException e){
					e.printStackTrace();	
				}
				return employeeList;
				}
			*/
			
			
			/*单条语句查询 根据name*/
			public Employee findbyname (String name){
				Employee employee=new Employee();
				String sql="select * from ((employee INNER join department ON employee.deid=department.deid) INNER join power on employee.pid=power.pid) inner join role on employee.rid=role.id where employee.username='"+name+"'";
				System.out.println(sql);
				try{
					ps=conn.prepareStatement(sql);
					rs=ps.executeQuery();
					if(rs.next()){
						employee.setId(rs.getInt(1));
						employee.setName(rs.getString(2));
						employee.setSex(rs.getString(3));
						employee.setAge(rs.getInt(4));
						employee.setTime(rs.getString(5));
						employee.setDeid(rs.getString(6));
						employee.setName(rs.getString(9));
						employee.setDepartmentname(rs.getString(12));
						employee.setPname(rs.getString(15));
						employee.setRname(rs.getString(18));
						
					}
				}
				catch(SQLException e){
					e.printStackTrace();	
				}
				return employee;
				}
			/*修改*/
			
			public boolean update(Employee employee){
				String sql="update employee set  username='"+employee.getUsername()+"',password='"+employee.getPassword()+"' , name='"+employee.getName()+"',sex='"+employee.getSex()+"',age='"+employee.getAge()+"',time='"+employee.getTime()+"',deid='"+employee.getDeid()+"',pid='"+employee.getPid()+"',rid='"+employee.getRid()+"' where id='"+employee.getId()+"'";
				System.out.println(sql);
				try {
					ps=conn.prepareStatement(sql);
				    int a =ps.executeUpdate();
				    if(a>0){
				    	return true;
				    }
				
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				return false;
			
			}	
		//根据id查询权限
		public Employee findbypow(int id){
			Employee employee=new Employee();
			String sql="select pname from employee inner join power on employee.pid=power.pid where employee.id="+id+"";
			try {
				ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()){
				
					employee.setPname(rs.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return employee;
			
		}
  //计算员工总数
		public int count(){
			int a=0;
			String sql="select count(*) from  employee";
	
			try {
				ps=conn.prepareStatement(sql);
		 	rs=ps.executeQuery();
		 	System.out.println("rs"+rs);
				if(rs.next()){
				a=rs.getInt(1);
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return a;
		}
}
