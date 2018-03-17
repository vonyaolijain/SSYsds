<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/reset.css" />
	<link rel="stylesheet" href="css/public.css" />
	<link rel="stylesheet" href="css/content.css" />
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
    
    <style type="text/css">
    
  #group1 input{
    font-size: 55px;
 
    }
    </style>
</head>
<body>
       
<div class="one" style="margin-left: 600px;">
  	
    <form action="EmployeeServlet" method="post" >
 
    	<div class="form-group" id="group1">
					<label for="">员工姓名</label>
					<input class="form-input-txt"  type="text" name="name" value="${requestScope.employee.name}"/>
				</div>
	<div class="form-group" id="group1">
					<label for="">性别</label>
					<input class="form-input-txt"  type="text" name="sex" value="${requestScope.employee.sex}"/>
				</div>
				<div class="form-group" id="group1">
					<label for="">年龄</label>
					<input class="form-input-txt"  type="text" name="age" value="${requestScope.employee.age}"/>
				</div>
				
				<div class="form-group" id="group1">
					<label for="">入职时间</label>
					<input class="form-input-txt"  type="text" name="time" value="${requestScope.employee.time}"/>
				</div>
				
				<div class="form-group" id="group1"> 
					<label for="">所属部门</label><br>
					
					<select name="deid">
					<c:forEach items="${requestScope.departmentList }" var="department">
					<option value="${ department.deid}">
					${department.departmentname}
				
					</option>
				
					</c:forEach>
					
		
					</select>
					
			
					<%-- <input class="form-input-txt"  type="text" name="departmentname" value="${requestScope.employee.departmentname}"/> --%>
				</div>
				
	<!-- <div class="form-group"><select name="mstate" class="form-select">
    					<option value="1" >可用</option>
    					<option value="0" selected="selected">不可用</option>
    				</select>
    				</div> -->
    				<br/>
    				<div class="there">
    				<input type="submit" value="确定" class="sub-btn">&nbsp;&nbsp;&nbsp;
    				<input type="reset" value="取消" class="sub-btn"> 
    				<input type="hidden" value="${requestScope.employee.id}" name="id"> 
    			 	<input type="hidden" value="edit" name="type">	 
	</div>
	</form>
  
  
  
  </div>





</body>
</html>