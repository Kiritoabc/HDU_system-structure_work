package org.hdu.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


    public Session getSession(){
        // 使用 ConfigurationFactory 加载 hibernate.properties 配置文件
        Configuration cof = new Configuration().configure("hibernate.properties");

        // 启用 Hibernate 的自动提交功能
        cof.setProperty("hibernate.autocommit", "true");

        // 设置映射文件的位置
        cof.setProperty("hibernate.hbm2ddl.auto", "update");
        cof.setProperty("hibernate.show_sql", "true");
        cof.setProperty("hibernate.format_sql", "true");

        // 构建 SessionFactory 对象
        SessionFactory sf = cof.buildSessionFactory();

        // 打开一个 Session 对象
        return sf.openSession();
    }
}
