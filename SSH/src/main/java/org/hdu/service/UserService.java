package org.hdu.service;

import org.hdu.pojo.User;

import java.io.InputStream;
import java.util.List;

public interface UserService {
    // 登录验证
    Long validLogin(String userName, String password);

    // user页面相关
    public void add(User user);

    public void delete(User user);

    public void update(User user);

    public User getUserById(int id);

    public List<User> getAllUsers();

    /**
     *  这个是在干嘛
     * @return
     */
    public InputStream getInputStream();

}
