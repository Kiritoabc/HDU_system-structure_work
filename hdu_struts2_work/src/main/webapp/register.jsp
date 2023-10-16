<%--
  Created by IntelliJ IDEA.
  User: Kirito
  Date: 2023/10/16
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>register</title>
</head>
<body>
    <s:form action="register">
        <s:textfield name="username" label="用户姓名" />
        <s:password name="password" label="密码"/>
        <s:textfield name="age" label="年龄"/>
        <s:textfield name="birthday" label="出生日期"/>
        <s:submit value="Submit"/>
<%--        <input type="button" value=“注册“ onclick="validate()">--%>
    </s:form>
</body>
    <script type="text/javascript">
        function validate(){
            var frm = document.forms[0];
            var username = frm.username.value;
            var pword = frm.password.value;
            if(username==null || username===""){
                alert("用户名不能为空");
                frm.username.focus();
                return false;// retuen false
            }
            return true
        }
    </script>
</html>