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


</head>
<body>
       	<h2 align="center"><a href="DepartmentServlet?type=findlist">添加部门</a></h2>
<table class="table table-hover text-center" >
	   		<tr  align="center">
				 <th>ID</th>
				 <th>部门名称</th>
				 <th>部门描述</th>
				 <th>操作</th>
	   		</tr>
  <c:forEach items="${requestScope.departmentList}" var="department" >
		<tr align="center">
			 <td>${department.deid }</td>
			 <td>${department.departmentname }</td>
				 <td>${department.ddesc }</td>
								 
			 <td>
			 <div class="button-group">
      <a class="button border-main"  href="DepartmentServlet?type=findbyid&id=${department.deid}" ><span class="icon-edit" ></span> 修改</a>
      <a class="button border-red"  href="DepartmentServlet?type=delete&id=${department.deid }" onclick="return del(1,1)" ><span class="icon-trash-o"></span> 删除</a>
      </div></td>
			 	
   		</tr>	
	</c:forEach>
   </table>
<script type="text/javascript">
	var btn=document.getElementById("a2");
	btn.onclick=function(){
		alert("没有权限");
	}
	var btn=document.getElementById("a3");
	btn.onclick=function(){
		alert("没有权限");
	}
	
</script>


</body>
</html>