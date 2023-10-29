<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
     <title>My JSP 'index.jsp' starting page</title>
     <meta http-equiv="pragma"content="no-cache">
     <meta http-equiv="cache-control"content="no-cache">
     <meta http-equiv="expires"content="0">
     <meta http-equiv="keywords"content="keyword1,keyword2,keyword3">
     <meta http-equiv="description"content="This is my page">
</head>

<body>
 <form name="login" action="login.action" method="post">
     用户名:
     <input name="username" type="text"/>
     密码:
     <input name="password" type="password">
     <input type="submit" value="登录"/>
 </form>
</body>
</html>