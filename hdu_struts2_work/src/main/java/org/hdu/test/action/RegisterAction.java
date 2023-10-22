package org.hdu.test.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterAction extends ActionSupport {

    public String username;
    public String password;

    public int age;

    public Date birthday;

    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (password.length()<6){
            String msg = "密码长度不能低于6位";
            this.addFieldError("password",msg);
        }
        // 邮箱验证
        String regex = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            String msg = "邮箱格式错误";
            this.addFieldError("email",msg);
        }
    }
}
