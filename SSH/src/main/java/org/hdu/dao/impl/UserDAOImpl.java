package org.hdu.dao.impl;

import org.hdu.dao.UserDAO;
import org.hdu.pojo.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("userDao")
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

    // 注入
    @Autowired
    public void setSessionFactory1(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
    @Override
    public User get(Long id) {
        //TODO Auto-generated method stub
        return getHibernateTemplate().get(User.class, id);
    }

    @Override
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public void update(User user) {
        getHibernateTemplate().update(user);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) getHibernateTemplate().find("from User");
    }

    @Override
    public User findUserByNameAndPass(String userName, String password) {
        List ul = getHibernateTemplate().find("from User where userName=? and password=?", userName, password);
        if (ul.size() == 1) {
            System.out.println("OK 123abc");
            return (User) ul.get(0);
        }
        return null;
    }
}
