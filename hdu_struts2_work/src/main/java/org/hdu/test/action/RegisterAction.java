package org.hdu.test.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class RegisterAction extends ActionSupport {

    public String username;
    public String password;

    public int age;

    public Date birthday;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void validate(){
        if (username == null || username.trim().equals("")){
            String msg = "用户名必须填";
            this.addFieldError("username",msg);
        }
    }
}
