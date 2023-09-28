package org.boluo.test;

import junit.framework.TestCase;
import org.boluo.test.dao.UserDao;
import org.boluo.test.dao.impl.UserDaoImpl;
import org.boluo.test.model.bean.UserBean;


/**
 *  UserDaoImpl 的测试
 */

public class UserDaoImplTest extends TestCase {

    UserDao dao;

    // 自动调用并执行
    protected void setUp(){
        dao = new UserDaoImpl();
    }

    // 运行结束要执行
    protected void tearDown(){

    }

    // 注册接口测试
    public void testRegister(){
        UserBean u = new UserBean();
        u.setId(3);
        u.setUsername("root");
        u.setPassword("root");
        dao.register(u);
    }

    // 检查接口测试
    public void testCheck(){
        UserBean u = new UserBean();
        u.setId(3);
        u.setUsername("root");
        u.setPassword("root");
        dao.check(u);
    }

    // 登录接口测试
    public void testLogin(){
        UserBean u = new UserBean();
        u.setId(3);
        u.setUsername("root");
        u.setPassword("root");
        dao.login(u);
    }
}
