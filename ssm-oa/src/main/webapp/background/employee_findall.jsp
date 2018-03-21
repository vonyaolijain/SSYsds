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
 <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
<style type="text/css">

</style>
</head>
<body>
       	<h2 align="center"><a href="EmployeeServlet?type=findlist">添加员工</a></h2>
<br/>

<table class="table table-hover text-center" >
	   		<tr  align="center">
				 <th>ID</th>
				 <th>用户名</th>
				 <th>密码</th>
				 
				 <th>员工姓名</th>
				 <th>性别</th>
				 <th>年龄</th>
				 <th>入职时间</th>	
				  <th>所属部门</th>	
				    <th>角色</th>
				   <th>操作</th>
				  			
	   		</tr>
  <c:forEach items="${requestScope.employeeList}" var="employee" >
		<tr align="center">
			 <td>${employee.id }</td>
			 <td>${employee.username}</td>
			 <td>${employee.password }</td>
			 <td>${employee.name }</td>
			 <td>${employee.sex}</td>
			 <td>${employee.age}</td>
			 <td>${employee.time}</td>
             <td>${employee.department.departmentname}</td>
		     <td>${employee.role.rname}</td>
				<td>
			 <div class="button-group">
      <a class="button border-main" href="EmployeeServlet?type=findbyid&id=${employee.id }"><span class="icon-edit" ></span> 修改</a>
      <a class="button border-red"  href="EmployeeServlet?type=delete&id=${employee.id }" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
			 	
   		</tr>	
	</c:forEach>
   </table>



</body>
</html>