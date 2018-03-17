package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xxgc.bean.Department;
import com.xxgc.conn.DBConnection;

public class DepartmentDAO {
	public Connection conn;
	public PreparedStatement ps;
	private ResultSet rs;
	
	public DepartmentDAO(){
		DBConnection db=new DBConnection();
		conn=db.conn;
	}
	//全查
	public List<Department> Findall(){
		
		List<Department> departments=new ArrayList<Department>();
		String sql="select * from department";
		
		try {
		
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Department department=new Department();
				department.setDeid(rs.getInt(1));
				department.setDepartmentname(rs.getString(2));
				department.setDdesc(rs.getString(3));
				departments.add(department);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return departments;
		
	}
	//删除
	public boolean delete(int id){
		String sql="delete  from department where deid="+id+"";
		System.out.println(sql);
		try {
			ps=conn.prepareStatement(sql);
		     ps.executeUpdate();
		     return true;
		     
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return false;
	}
	
	//添加
	public boolean add(String departmentname,String ddesc){
		
		String sql="INSERT into department (departmentname,ddesc) VALUES('"+departmentname+"','"+ddesc+"')";
	  try {
		ps=conn.prepareStatement(sql);
	    ps.executeUpdate();
	    return true;
	
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
		return false;
		
	}
	
	//单查
		public Department findbyid(int id){
			Department department=new Department();
			String sql="select * from department where deid="+id+"";
			System.out.println(sql);
			try {
				ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()){
					department.setDeid(rs.getInt(1));
					department.setDepartmentname(rs.getString(2));
					department.setDdesc(rs.getString(3));
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			return department;
			
		}
	//修改
		public boolean update(int id,String departmentname,String ddesc){
			
		String sql="update department set departmentname='"+departmentname+"',ddesc='"+ddesc+"' where deid="+id+" ";	
		System.out.println(sql);
		try {
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
			
		}
	
}
