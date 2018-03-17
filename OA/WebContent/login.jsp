<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/manager_login.css">
</head>
<body>

<section class="container">
    <div class="login">
      <h1>人员信息管理登录</h1>
      <form method="post" action="EmployeeServlet?type=login">
        <p><input type="text" name="username" value="${sessionScope.username }" placeholder="用户名"></p>
        <p><input type="password" name="password" value="${sessionScope.password }" placeholder="密码"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            记住密码
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="登录"></p>
    	<input type="hidden" value="login" name="type">	
      </form>
    </div>

    <div class="login-help">
      <p>忘记密码? <a >点击修改</a>.</p>
       <p style="color: red; font-size: 16px;">用户名 root 密码 sa</p>
    </div>
  </section>


</body>
</html>