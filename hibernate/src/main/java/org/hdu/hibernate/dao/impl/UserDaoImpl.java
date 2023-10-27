package org.hdu.hibernate.dao.impl;

import org.hdu.hibernate.dao.UserDao;
import org.hdu.hibernate.model.bean.User;
import org.hdu.hibernate.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User u) {
        Session session=new HibernateUtil().getSession();
        Transaction tran= session.beginTransaction();
        try{
            session.save(u);
            tran.commit();
        }catch (HibernateException e){
            e.printStackTrace();
            tran.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public void update(User u) {
        Session session= new HibernateUtil().getSession();
        Transaction tran= session.beginTransaction();
        try{
            session.update(u);
            tran.commit();
        }catch (HibernateException e){
            e.printStackTrace();
            tran.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public List<User> delete(User u) {
        Session session=new HibernateUtil().getSession();
        try{
            Query q=session.createQuery("from User");
            List list=q.list();
            return list;

        }catch (HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public User list(int id) {
        Session session=new HibernateUtil().getSession();
        try{
            return (User)session.get(User.class,Integer.valueOf(id));
        }catch (HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public User get(int id) {

        Session session=new HibernateUtil().getSession();
        try{
            return (User)session.get(User.class,Integer.valueOf(id));
        }catch (HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
}
