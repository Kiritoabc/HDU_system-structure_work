> 文档: Hibernate



~~~java
public class HibernateUtil{
  public Session getSession(){
    Configuration cof=new Configuration();
    cof.configure();
    SessionFactory sf=cof.buildSessionFactory();
    Session session=sf.openSession();

   return session;
	}
}
~~~



~~~java
public void save(User u);
{
	Session session=new HibernateUtil.getSession();
  	Tranction tran=  session.beginTransaction();
 try{
   session.save(u);
  
    tran.commit();
    }catch (HibernateException e){
    e.printStackTrace();
    tran.rollback();
   }finally{
    session.close();
 }
    
 public void update(User u);
 {
   Session session=new HibernateUtil.getSession();
   Tranction tran=  session.beginTransaction();
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
     
 public void delete(int id);
{
   Session session=new HibernateUtil.getSession();
 try{
  Query q=session.createQuery(“from User”);
  List list=q.list();
 return list;
  
    }catch (HibernateException e){
    e.printStackTrace();
   }finally{
    session.close();
    }
   return null;
}
public void list();
{
 	Session session=new HibernateUtil.getSession();
try{
   	return (User)session.get(User.class,new Integer(id);
}catch (HibernateException e){
   	e.printStackTrace();
}finally{
  	session.close();
	}
}
public User get(int id)
{
 	Session session=new HibernateUtil.getSession();
	try{
   		return (User)session.get(User.class,new Integer(id);
	}catch (HibernateException e){
   			e.printStackTrace();
	}finally{
  		session.close();
	}
}
~~~

