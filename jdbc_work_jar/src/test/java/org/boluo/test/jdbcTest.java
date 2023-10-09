package org.boluo.test;


import org.boluo.test.model.bean.UserBean;
import org.junit.Test;

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

    /**
     *  jdbc添加测试
     */
    @Test
    public void test3(){
        // 连接
        mysqlConn();
        String sql = "insert into user(id,username,password) values(3,'测试3','123456')";

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("插入成功！");

            System.out.println("插入结束！");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  修改测试
     */
    @Test
    public void test4(){
        // 连接
        mysqlConn();
        PreparedStatement ps = null;
        int id = 1;
        // 使用 ? 作为占位符
        String sql = "update user set username='修改1' where id = ?";
        try {
            // 使用 PreparedStatement 避免sql注入问题
            ps = conn.prepareStatement(sql);
            // 设置参数
            ps.setObject(1,id);
            // 执行更新
            ps.executeUpdate();
            System.out.println("更新成功");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  删除测试
     */
    @Test
    public void test5(){
        mysqlConn();
        int id = 3;
        String sql = "delete from user where id = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);

            ps.setObject(1,id);

            int del = ps.executeUpdate();

            System.out.println("删除成功,del = " + del);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
