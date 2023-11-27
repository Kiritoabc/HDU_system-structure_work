package org.hdu.hdu_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hdu.hdu_springboot.mapper.UserMapper;
import org.hdu.hdu_springboot.model.User;
import org.hdu.hdu_springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Kirito
* @description 针对表【User】的数据库操作Service实现
* @createDate 2023-11-27 16:28:04
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




