<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>欢迎${loginUser.userName} 您的身份是 ${loginUser.identity.identityName} 请选择操作</h2>
	<a href="#">添加用户</a><br/>
	<a href="#">删除用户</a><br/>
	<a href="#">修改用户信息</a><br/>
	<a href="#">查询用户</a><br/>
	<a href="#">显示用户</a><br/>

</body>
</html>