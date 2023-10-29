package org.hdu.dao;

import org.hdu.pojo.User;

import java.util.List;


public interface UserDAO {

    /**
     *  根据id查找用户
     * @param id
     * @return
     */
    User get(Long id);


    /**
     *  添加用户
     * @param user
     */
    void save(User user);

    /**
     *   修改用户
     * @param user
     */
    void update(User user);

    /**
     *  根据用户id删除用户
     * @param id
     */
    void delete(Long id);

    /**
     *  删除用户
     * @param user
     */
    void delete(User user);

    /**
     *  查询全部用户
     * @return
     */
    List<User> findAll();

    /**
     *  更具用户名，密码查找用户
     * @param userName
     * @param password
     * @return
     */
    User findUserByNameAndPass(String  userName, String password);
}
