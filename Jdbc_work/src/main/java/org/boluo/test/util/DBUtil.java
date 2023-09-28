package org.boluo.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false&serverTimezone=UTC";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";

    // 数据库驱动加载
  public DBUtil(){
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    // 连接数据库驱动
    public Connection openConnection(){
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("连接数据库驱动成功");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
