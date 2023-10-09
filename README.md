# java_code

本次关于java的代码用于hdu的体系架构课程的作业
本项目启用docker启动的mysql

```powershell
docker run -p 3306:3306 --name mysql -v E:/works/docker/mysql8.0/conf:/etc/mysql/conf.d -v E:/works/docker/mysql8.0/logs:/var/log/mysql -v E:/works/docker/mysql8.0/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest --default-authentication-plugin=mysql_native_password
```

- **第一次作业:** 编写jdbc相关的代码和测试，代码位于**jdbc_work**其中**jdbc_work_jar**为jar包版本。

