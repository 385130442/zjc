<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %> 

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>update</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<json:object>
    	<json:property name="code" value="${ mes.code}"></json:property>
    	<json:property name="message" value="${mes.message}"></json:property>
    	<json:property name="userName" value="${signUp.userName}"></json:property>
    	<json:property name="promise" value="${signUp.promise}"></json:property>
    	<json:property name="stuNo" value="${signUp.stuNo}"></json:property>
    	<json:property name="name" value="${signUp.name}"></json:property>
    	<json:property name="createAt" value="${signUp.createAt}"></json:property>
    	<json:property name="updateAt" value="${signUp.updateAt}"></json:property>
    </json:object>
  </body>
</html>
