package org.boluo.test;


import org.boluo.test.model.bean.UserBean;
import org.junit.jupiter.api.Test;

import java.sql.*;


public class jdbcTest {

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    Statement stmt = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false&serverTimezone=UTC";


    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";

    /**
     *  测试数据库连接
     */
    @Test
    public void test1(){
        mysqlConn();
    }

    private void mysqlConn() {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("连接数据库驱动成功");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  查询测试
     */
    @Test
    public void test2(){
        mysqlConn();
        try {
            stmt = conn.createStatement();
            String sql;
            sql = "select id,username,password from `user`";
            ResultSet rs = stmt.executeQuery(sql);
            // 展开数据
            while (rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");

                UserBean bean = new UserBean(id, username, password);
                System.out.println("bean = " + bean);
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
