package org.hdu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hdu.pojo.User;
import org.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.InputStream;
import java.util.Map;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private User user;
    private UserService userService;


    public String addUI() {
        return "addUI";
    }

    public String add() {
        userService.add(user);
        return "add";
    }

    public String updateP() {
        user = userService.getUserById(user.getId());
        return "updateP";
    }

    public String update() {
        userService.update(user);
        return "update";
    }

    public String delete() {
        userService.delete(user);
        return "delete";
    }

    @SuppressWarnings("unchecked")
    public String list() {
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("list", userService.getAllUsers());
        return "list";
    }

    public String download() {
        return "download";
    }

    public InputStream getDownloadFile() {
        return userService.getInputStream();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public UserService getUserService() {
        return userService;
    }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
