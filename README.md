# HDU_system structure_work

**本次关于java的代码用于hdu的体系架构课程的作业**
**本项目启用docker启动的mysql**

```powershell
docker run -p 3306:3306 --name mysql -v E:/works/docker/mysql8.0/conf:/etc/mysql/conf.d -v E:/works/docker/mysql8.0/logs:/var/log/mysql -v E:/works/docker/mysql8.0/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest --default-authentication-plugin=mysql_native_password
```

## **第一次作业:** 编写jdbc相关的代码和测试

- 代码位于**jdbc_work**其中**jdbc_work_jar**为jar包版本。



注： 关于数据库的连接在**DBUtil**中，需要修改成自己的数据库名称。提供了sql文件位于db包下。保证一致后，运行测试的代码 **UserDaoImplTest**即可。



## **第二次作业:** 编写struts2相关的代码项目启动

- 代码位于 **hdu_struts2_work** ,其中**struts2_work**为本人学习时的相关代码。


命令行启动：

~~~powershell
# 打开hdu_struts2_work项目，打开命令行
cd hdu_struts_work
mvn jetty:run
# 如果报错，查看是否将 maven 加入环境变量。
~~~

或者idea中maven启动，点击 jetty:run 即可启动 

2. 访问 [localhost:8080/hdu_struts2_work/login.jsp]() 页面即可



## 如发现相关bug，欢迎提交pr，感谢。