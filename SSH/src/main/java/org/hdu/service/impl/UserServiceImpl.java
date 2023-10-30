package org.hdu.service.impl;

import org.hdu.dao.UserDAO;
import org.hdu.pojo.User;
import org.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public Long validLogin(String userName, String password) {
        User user = userDAO.findUserByNameAndPass(userName, password);
        if (user == null){
            return null;
        }
        return (long) user.getId();
    }

    @Override
    public void add(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }


    @Override
    public InputStream getInputStream() {
        return null;
    }

}
