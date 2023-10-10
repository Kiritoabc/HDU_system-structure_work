package org.hdu.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        if("suo".equals(this.userName) && "123".equals(this.password)) {
            return "SUCCESS";
        } else {
            return "fail";
        }
    }
}
