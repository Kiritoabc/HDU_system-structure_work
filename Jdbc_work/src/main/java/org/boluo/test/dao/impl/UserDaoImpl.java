package org.boluo.test.dao.impl;

import org.boluo.test.dao.UserDao;
import org.boluo.test.model.bean.UserBean;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean register(UserBean usr) {
        return false;
    }

    @Override
    public boolean check(UserBean usr) {
        return false;
    }

    @Override
    public UserBean login(UserBean usr) {
        return null;
    }
}
