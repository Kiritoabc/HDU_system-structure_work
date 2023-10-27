package org.hdu.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


    public Session getSession(){
        Configuration cof= new Configuration();
        cof.configure();
        SessionFactory sf=cof.buildSessionFactory();
        Session session=sf.openSession();
        return session;
    }
}
