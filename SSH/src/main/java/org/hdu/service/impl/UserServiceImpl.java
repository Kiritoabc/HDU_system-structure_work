package org.hdu.service.impl;

import org.hdu.dao.UserDAO;
import org.hdu.pojo.User;
import org.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return user.getId();
    }

}
