<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript"> 
function countDown(secs,surl){ 
 //alert(surl); 
 var jumpTo = document.getElementById('jumpTo');
 jumpTo.innerHTML=secs; 
 if(--secs>0){ 
  setTimeout("countDown("+secs+",'"+surl+"')",1000); 
 }
 else
 {  
  location.href=surl; 
 } 
} 
</script>
<style type="text/css">
.one{width: 1000px; height: 400px;margin:0 auto;}
#jumpTo{text-align: center;color: red;font-size: 16px;}
</style>
</head>
<body>
<div class="one">
<span id="jumpTo"><h5>5</h5></span>秒后自动跳转到登录界面
<script type="text/javascript">
countDown(5,'../login.jsp');
</script> 
<img src="../image/four.png">

</div>

</body>
</html>