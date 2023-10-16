<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Kirito
  Date: 2023/10/10
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
  <title>用户登录界面</title>
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
  <form action="login.action" method="post">
      用户名：<input type="text" name="userName"/><br/>
      密码：<input type="password" name="password"/><br/>
      <input type="submit" value="提交"/>
  </form>
<%--    <s:form  action="login">--%>
<%--        <s:textfield name="userName" label="用户名:" />--%>
<%--        <s:textfield name="password" label="密码:" />--%>
<%--        <s:submit value="Submit" />--%>
<%--    </s:form>--%>

</body>

</html>
