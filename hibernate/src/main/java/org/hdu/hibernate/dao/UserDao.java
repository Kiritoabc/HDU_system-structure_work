package org.hdu.hibernate.dao;

import org.hdu.hibernate.model.bean.User;

import java.util.List;

public interface UserDao {

    public void save(User u);


    public void update(User u);


    public List<User> delete(User u);

    public User list(int id);

    public User get(int id);
}
