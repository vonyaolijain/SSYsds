<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<!-- 213 -->
<%--221--%>
<%!
private int Initvar=0;
private int Destroyvar=0;
private int Servicevar=0;

%>
<%!
public void jspInit(){
	Initvar++;
	System.out.println("初始化"+Initvar);
}

public void jspDestroy(){
	 Destroyvar++;
	System.out.println("销毁"+Destroyvar);
}

%>

<%
 Servicevar++;
System.out.println("响应"+Servicevar);

%>


</body>
</html>