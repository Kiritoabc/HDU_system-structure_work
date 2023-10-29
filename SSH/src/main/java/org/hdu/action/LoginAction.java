package org.hdu.action;


import com.opensymphony.xwork2.ActionSupport;
import org.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

    @Autowired
    protected UserService mgr;
    private String username;

    private String password;

    // 登录逻辑
    public String execute() {
        System.out.println("点击登录执行方法");
        if (username.equals("") || username==null) {
            return "fail";
        }
        Long userId = mgr.validLogin(username, password);
        if (userId == null){
            System.out.println("用户非法");
            addActionError("用户名/密码不匹配");
            return "fail";
        }
        System.out.println("合法用户，userId = " + userId);
        return "SUCCESS";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserService getMgr() {
        return mgr;
    }

    public void setMgr(UserService mgr) {
        this.mgr = mgr;
    }

    @Override
    public String toString() {
        return "LoginAction{" +
                "mgr=" + mgr +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
