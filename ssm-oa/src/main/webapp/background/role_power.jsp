<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
${requestScope.rid }
	<h2 align="center"><a href="add_rolepower?id=${requestScope.id }">添加权限</a></h2>
	<table class="table table-hover text-center">
		<tr background="red">
			<td>拥有的权限</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.prteamList}" var="prteam">
			<tr>
				<td>${prteam.id}</td>
				<td>${prteam.pname}</td>
				<td><a >修改</a>&nbsp;&nbsp;&nbsp;<a href="rpower_delete?id=${prteam.id}&rid=${requestScope.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	

s
</body>
</html>