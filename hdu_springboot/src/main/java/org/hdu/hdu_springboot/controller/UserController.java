package org.hdu.hdu_springboot.controller;

import org.hdu.hdu_springboot.mapper.UserMapper;
import org.hdu.hdu_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/get")
    public User GetUserById(@RequestParam("id") String id){
        return userMapper.selectById(id);
    }

    @GetMapping("/hello")
    public String Hello(){
        return "hello world";
    }

}
