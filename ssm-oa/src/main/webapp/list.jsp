<%@ page language="java" contentType="text/html; charset=UTf-8"
    pageEncoding="UTf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"    %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTf-8">
<title>Insert title here</title>
</head>
<body>
<table>


<tr>
<td>id</td>
<td>name</td>
<td>address</td>
</tr>

<c:forEach items="${list }" var="list">
<tr>
<td>${list.deid}</td>
<td>${list.departmentname }</td>
<td>${list.ddesc}</td>
<td><a href="delete?deid=${list.deid}">删除</a></td>
</tr>
</c:forEach>

</table>


</body>
</html>