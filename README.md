# java_code

**本次关于java的代码用于hdu的体系架构课程的作业**
**本项目启用docker启动的mysql**

```powershell
docker run -p 3306:3306 --name mysql -v E:/works/docker/mysql8.0/conf:/etc/mysql/conf.d -v E:/works/docker/mysql8.0/logs:/var/log/mysql -v E:/works/docker/mysql8.0/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest --default-authentication-plugin=mysql_native_password
```

## **第一次作业:** 编写jdbc相关的代码和测试，代码位于**jdbc_work**其中**jdbc_work_jar**为jar包版本。







## **第二次作业:** 编写struts2相关的代码，代码位于 **hdu_struts2_work** ,其中**struts2_work**为本人学习时的相关代码。

1. 项目启动：

命令行启动：

~~~powershell
# 打开hdu_struts2_work项目，打开命令行
cd hdu_struts_work
mvn jetty:run
# 如果报错，查看是否将 maven 加入环境变量。
~~~

idea中maven启动，点击 jetty:run 即可启动 

![1696920321113](D:\code\java_code\README.assets\1696920321113.png)

2. 访问 [localhost:8080/hdu_struts2_work/login.jsp]() 页面



## 如发现相关bug，欢迎提提交pr，感谢。