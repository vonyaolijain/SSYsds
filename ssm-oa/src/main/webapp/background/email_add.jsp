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
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/reset.css" />
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/public.css" />
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/content.css" />
    <script src="<%=request.getContextPath() %>/js/jquery.js"></script>
    <script src="<%=request.getContextPath() %>/js/pintuer.js"></script>  
    <style type="text/css">
    
  #group1 input{
    font-size: 15px;
     
    }
    </style>
</head>
<body>
       

<div class="one" style="margin-left: 600px;">
  	
    <form action="<%=request.getContextPath() %>/EmailServlet?type=add" method="post" >
     				
    	<div class="form-group" id="group1">
					<label for="">邮件标题</label>
					<input class="form-input-txt"  type="text" name="etitle" value=""/>
				</div>
	<div class="form-group" id="group1">
					<label for="">邮件内容</label>
					<input class="form-input-txt"  type="text" name="econtent" value="${requestScope.department.ddesc}"/>
				</div>
				
		<div class="form-group" id="group1">
					<label for="">选择收件人</label>
					<select name="eids">
					
					<c:forEach items="${requestScope.employeeList }" var="list">
					<c:choose>
					<c:when test="${list.id ==sessionScope.employee.id}">
					</c:when>
					<c:otherwise>	<option value="${list.id }">${list.name }</option></c:otherwise>
					</c:choose>
				
					
					</c:forEach>
					
					</select>
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
    				<input type="hidden" value="${sessionScope.employee.id}" name="eid"> 
    			ss	${sessionScope.employee.id}
    			  
	</div>
	</form>
  
  
  
  </div>





</body>
</html>