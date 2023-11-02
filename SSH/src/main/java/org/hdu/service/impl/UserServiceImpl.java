package org.hdu.service.impl;

import com.alibaba.excel.EasyExcel;
import org.hdu.dao.UserDAO;
import org.hdu.pojo.User;
import org.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public Long validLogin(String userName, String password) {
        User user = userDAO.findUserByNameAndPass(userName, password);
        if (user == null){
            return null;
        }
        return (long) user.getId();
    }

    @Override
    public void add(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }


    // 生成Excel
    @Override
    public InputStream getInputStream() {
        // 获取data数据
        List<User> data = userDAO.findAll();
        ByteArrayOutputStream content = new ByteArrayOutputStream();
        // 生成一个 名字为 sheet1 的Excel
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(content, User.class)
                .sheet("sheet1")
                .doWrite(data);

        return new ByteArrayInputStream(content.toByteArray());
    }

}
