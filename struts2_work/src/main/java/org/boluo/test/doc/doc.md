程序4 structs2

 

1 添加jar包,拷贝到web-inf/lib 下面

 commons-logging-1.0.4.jar

freemarker-2.3.8.jar

ognl-2.6.11.jar

structs2-core-2.0.14.jar

xwork-2.0.7.jar

 

2 web.xml

~~~xml
<filter>
    <filter-name>
        struts2
    </filter-name>
    <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
</filter>

<filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
~~~

 

3.创建action 属性与表单对应，自动会获取表单里的值

~~~java
package org.hdu.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        if("suo".equals(this.userName) && "123".equals(this.password)) {
            return "SUCCESS";
        } else {
            return "fail";
        }
    }
}

~~~



 

structs.xml

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
        "-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
        "http://struts.apache.org/dtds/struts-2.5.dtd">

<struts>
    <package name="test" namespace="/test" extends="struts-default">
        <action name="login" class="org.hdu.test.action.Login" method="execute">
            <result name="SUCCESS">/WEB-INF/result/success.jsp</result>
            <result name="fail">/WEB-INF/result/fail.jsp</result>
        </action>
    </package>


</struts>
~~~



 

 login.jsp文件

~~~jsp
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

    <form action="/test/login" method="post">  

         用户名：<input type="text" name="userName"/><br/>  

         密码：<input type="password" name="password"/><br/>  

        <input type="submit" value="提交"/>  

</form>  

</body>  

</html>
~~~







 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  

   

 <html>  

   <head>  

​      

​    <title>用户登录界面</title>  

​       

​     <meta http-equiv="pragma" content="no-cache">  

​     <meta http-equiv="cache-control" content="no-cache">  

​     <meta http-equiv="expires" content="0">      

​     <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  

​     <meta http-equiv="description" content="This is my page">  

​     <!-- 

​     <link rel="stylesheet" type="text/css" href="styles.css"> 

​     -->  

   

   </head>  

​     

   <body>  

​    <form action="/test/login" method="post">  

​         用户名：<input type="text" name="userName"/><br/>  

​         密码：<input type="password" name="password"/><br/>  

​        <input type="submit" value="提交"/>  

</form>  

</body>  

</html>  

 

 

 