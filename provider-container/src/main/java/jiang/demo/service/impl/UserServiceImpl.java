package jiang.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import jiang.demo.mapper.UserMapper;
import jiang.demo.service.model.User;
import jiang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User findById(int userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public User findByName(String name) {
        return userMapper.findUserByName(name);
    }
}
