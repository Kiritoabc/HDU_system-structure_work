package org.boluo.test.dao.impl;

import org.boluo.test.dao.UserDao;
import org.boluo.test.model.bean.UserBean;
import org.boluo.test.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean register(UserBean usr) {
        //todo： -->  参数检查 id , username , password

        DBUtil util = new DBUtil();
        Connection conn = util.openConnection();
        String sql = "insert into user(id,username,password) values (?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            pstmt.setInt(1,usr.getId());
            pstmt.setString(2,usr.getUsername());
            pstmt.setString(3,usr.getPassword());
            // 执行
            int flag = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return flag == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean check(UserBean usr) {
        //todo：--> 参数检查 username

        DBUtil util = new DBUtil();
        Connection conn = util.openConnection();
        String sql = "select * from user where username = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1,usr.getUsername());

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                pstmt.close();
                conn.close();
                return true;
            }
            pstmt.close();
            conn.close();
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public UserBean login(UserBean usr) {
        //todo： --> 参数检查 username , password

        DBUtil util = new DBUtil();
        Connection conn = util.openConnection();
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1,usr.getUsername());
            pstmt.setString(2,usr.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                 UserBean u = new UserBean();
                 u.setId(rs.getInt(1));
                 u.setUsername(usr.getUsername());
                 u.setPassword(usr.getPassword());
                 pstmt.close();
                 conn.close();
                 return u;
            }
            pstmt.close();
            conn.close();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
