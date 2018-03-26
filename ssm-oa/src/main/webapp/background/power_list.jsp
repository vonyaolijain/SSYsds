<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="add_ropo">
	<table>
		<c:forEach items="${powerList}" var="power">
			<tr>
				<td>${power.pid}</td>
				<td>${power.pname}</td>
				<td>${power.purl}</td>
				<td><input type="checkbox" name="pid" value="${power.pid}"></td>
			</tr>
		</c:forEach>
		
	</table>
	<input type="submit" value="添加">
	<input type="hidden" name="rid" value="${requestScope.rid }">
</form>
</body>
</html>