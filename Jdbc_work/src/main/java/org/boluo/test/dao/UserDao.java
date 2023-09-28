package org.boluo.test.dao;

import org.boluo.test.model.bean.UserBean;

public interface UserDao {
    /***
     *
     * @param usr
     *     注册接口
     *          注册成功 -->  true
     *          注册失败 -->  false
     * @return
     */
    public boolean register(UserBean usr);

    /**
     *
     * @param usr
     *      检查用户是否存在接口
     *           存在   --> true
     *           不存在 --> false
     * @return
     */
    public boolean check(UserBean usr);

    /**
     *
     * @param usr
     *      登录接口
     *          登录成功 --> 返回用户的基本信息
     *          登录失败 --> 返回 null
     * @return
     */
    public UserBean login(UserBean usr);
}
