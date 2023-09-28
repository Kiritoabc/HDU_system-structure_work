## 例子

~~~java
public boolean register(UserBean usr){
   DBUtil util=new DBUtil();
  Connection conn=util.openConnection();
 String sql=“insert into User(id,username,password) ”+” values(?,?,?)”;
//sql=“select * from User where username=? and password=?”;
try{
PreparedStatement pstmt=conn.prepareStatement(sql);
pstmt.setInt(1,usr.getId());
pstmt.setString(2,usr.getUsername());
pstmt.setPossword(3,usr.getPassword());
pstmt.executeUpdate();
//ResultSet rs= pstmt.executeQuery();
// while(rs.next()){  file:///Users/xu/Documents/课程/javaWeb/文档/2015-2016-1/     UserBean u=new UserBean();
     u.setId( rs.getInt (“id”) );
     u.setUsername(rs.getString(“username”);
     u.setPassword(rs.getString(‘password”);
   return u;
}
//
}catch(Exception e){
 e.printStack(); return null;
}finally{
 pstmt.close();
  DBUtil.closeConn(conn);
}

 }

}
add(User u){
DBUtil util=new DBUtil();
Connection conn=util.openConnection();
String sql=“insert into User(id,username,pwd) values(?,?,?)”;
try(
PreparedStatement pstmt=conn.prepareStatement(sql);
pstmt.setInt(1,u.getId());
pstmt.setString(2,u.getUsername());
pstmt.setPwd(3,u.getUsername());
pstmt.executeUpdate();
}catch(SQLException e){

}finally{
  util.closeConn(conn);
}
}
User list（）；
register（User u）
｛
  sql＝inert into user（id,username,pwd) values(?,?,?)”;
DBUtil util =new DBUtil();
try{
PraparedStatement pstmt=conn.prepareStatement(sql);
pstmt.setInt(1,u.getId());
pstmt.setString(2
pstmt.setString(3
pstmt.executeUpdate();
｝catch(SQLException)
{
 e.printStackTrace();
}finally{
util.closeConn(conn):
}
finally
 {util.closeConn();
}
User  login（String username，String pwd）

{
sql＝“select ＊ from where username＝？ and pwd＝？”；
DBUtil util=new DBUtil();
Connection conn=util.openConnection();
try｛
 pstmt.setString(1,username);
pstmt.setString(2,password);
ResultSet rs=pstmt.executeQuery();
if(rs.next()){
 User u=new User();
u.setId(id);
    }
}finally{
util.closeConn(conn);
} 
 return U;
}
｝
查询数据有没有

return null;
}
boolean check（string username）
｛
跟login相比，
sql语句只检查username
结果改成return true；
if（rs.next()){
return true;
 ｝

return false;

测试：
packae com.hdu.test;

import junit.framework.TestCase;
public class UserDaoImplTest extends TestCase{
UserDao dao；   
 protected void setUp() //自动调用并执行
 { 
    dao＝new UserDaoImpl（）；
}
 protected void tearDown（）／／运行结束要执行
{
}
／／顺序执行
public void testRegister extends TestCase（
   User u= new User();
   u.setId(1);
   u.setUsername(“root”);
   u.setPassword(“root”);
   dao.register(u);

）
public void testCheck（）{

}

public void testLogin（）{

}
~~~

