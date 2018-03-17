package com.xxgc.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8";

	String name="root";
	String pass="sa";
	
	
	public Connection conn;
	public DBConnection(){
		
		try{
			Class.forName(driver).newInstance();
			 conn=DriverManager.getConnection(url,name,pass);
			System.out.println("--------ok-------");
	
		}
	catch(Exception e){
	
		System.out.print("---error-----");
		e.printStackTrace();
	}
	}
}
