<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>
	<link rel="stylesheet" href="<%=path %>/css/reset.css">
	<link rel="stylesheet" href="<%=path %>/css/public.css">
</head>
<body>

<%  
          String ip = request.getHeader("x-forwarded-for");  
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("Proxy-Client-IP");  
            }  
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("WL-Proxy-Client-IP");  
            }  
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getRemoteAddr();  
            }  
             
        %>  
      
      <c:if test="${sessionScope.employee.name ==null}">
      <jsp:forward page="../login.jsp"></jsp:forward>
      </c:if>
<div class="public-header-warrp">
	<div class="public-header">
		<div class="content">
			<div class="public-header-logo"><a href=""><i>LOGO</i><h3>人员管理系统</h3></a></div>
			<div class="public-header-admin fr">
				<p class="admin-name" ><a style="color: red"> </a>${sessionScope.employee.name }</p>
				<div class="public-header-fun fr">
					<a href="../ManagerServlet?type=quits" class="public-header-man">退出</a>
					<a href="../ManagerServlet?type=quit" class="public-header-loginout">安全注销</a>	
				</div>
			</div>
		</div>
	</div>
</div>
<div class="clearfix"></div>
<!-- 内容展示 -->
<div class="public-ifame mt20">
	<div class="content">
	<!-- 内容模块头 -->
		<div class="public-ifame-header">
			<ul>
				<li class="ifame-item logo">
					<div class="item-warrp">
						<a href="#"><i>LOGO</i>
							<h3 class="logo-title">
							
							
				<jsp:useBean id="now" class="java.util.Date" scope="page"></jsp:useBean>
    <fmt:formatDate value="${now }" pattern="yyyy年MM月dd日"/>
    <fmt:formatDate value="${now }" pattern="HH:mm:ss"/>
        ${now }
         </h3>
						
						</a>
					</div>
				</li>
				
				
				<li class="ifame-item"><div class="item-warrp"><br/><a href="<%=request.getContextPath() %>/AttenceServlet?type=add">点击签到</a></div></li>
				<li class="ifame-item"><div class="item-warrp" style="border:none"><span></span><br><span>当前在线人数${applicationScope.count} /${sessionScope.countlist }</span></div></li>
				
			</ul>
		</div>
		<div class="clearfix"></div>
		<!-- 左侧导航栏 -->
		<div class="public-ifame-leftnav">
			<div class="public-title-warrp">
				<div class="public-ifame-title ">
					<a href="../index.jsp">首页</a>
				</div>
			</div>
			<ul class="left-nav-list">
			<li class="public-ifame-item">
					<a href="javascript:;">签到系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li class="active"><a href="../AttenceServlet?type=findall" target="content">查询签到</a></li>
							<li><a href="" target="">待完善</a></li>
							<li><a href="" target="">待完善</a></li>
							<li><a href="" target="">待完善</a></li>
						</ul>
					</div>
				</li>
				<li class="public-ifame-item">
					<a href="javascript:;">部门系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li class="active"><a href="<%=path %>/de_getAll" target="content">查询部门</a></li>
							<li><a href="" target="">待完善</a></li>
							<li><a href="" target="">待完善</a></li>
							<li><a href="" target="">待完善</a></li>
						</ul>
					</div>
				</li>
				<li class="public-ifame-item">
					<a href="javascript:;">员工系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li><a href="<%=path %>/em_getAll" target="content">查询员工</a></li>
							<li><a href="">待完善</a></li>
						</ul>
					</div>
				</li>
				
				<li class="public-ifame-item">
					<a href="javascript:;">角色系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li><a  href="<%=path %>/ro_getAll" target="content">查询角色</a></li>
						<li><a href="" target="">待完善</a></li>
						</ul>
					</div>
				</li>
				<li class="public-ifame-item">
					<a href="javascript:;">权限系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li><a href="../PowerServlet?type=Findall" target="content">查看</a></li>
							<li><a href="../ImagesServlet?type=findbystate&imstate=02" target="content"> 普通图片</a></li>
						</ul>
					</div>
				</li>
				
				
				<li class="public-ifame-item">
					<a href="javascript:;">邮箱系统</a>
					<div class="ifame-item-sub">
						<ul>
							<li><a href="../EmailServlet?type=findallem" target="content">写邮件</a></li>
						</ul>
					</div>
				</li>
			</ul>
		</div>
		<!-- 右侧内容展示部分 -->
		<div class="public-ifame-content">
		<iframe name="content" src="background/1.jsp" frameborder="0" id="mainframe" scrolling="yes" marginheight="0" marginwidth="0" width="100%" style="height: 600px;"></iframe>
		</div>
	</div>
</div>
<script src="<%=path %>/js/jquery.min.js"></script>
<script>
$().ready(function(){
	var item = $(".public-ifame-item");

	for(var i=0; i < item.length; i++){
		$(item[i]).on('click',function(){
			$(".ifame-item-sub").hide();
			if($(this.lastElementChild).css('display') == 'block'){
				$(this.lastElementChild).hide()
				$(".ifame-item-sub li").removeClass("active");
			}else{
				$(this.lastElementChild).show();
				$(".ifame-item-sub li").on('click',function(){
					$(".ifame-item-sub li").removeClass("active");
					$(this).addClass("active");
				});
			}
		});
	}
});
</script>
<%-- <% String name=(String)session.getAttribute("username"); 
   if(name!=null){%>

<%}
   else{ %>
<%response.sendRedirect("../login.jsp"); %>
<%} %>
 --%>
</body>
</html>