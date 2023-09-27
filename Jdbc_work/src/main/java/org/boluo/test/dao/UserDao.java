package org.boluo.test.dao;

import org.boluo.test.model.bean.UserBean;

public interface UserDao {
    /***
     *
     * @param usr
     * @return
     */
    public boolean register(UserBean usr);

    /**
     *
     * @param usr
     * @return
     */
    public boolean check(UserBean usr);

    /**
     *
     * @param usr
     * @return
     */
    public UserBean login(UserBean usr);
}
