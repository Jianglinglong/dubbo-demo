package jiang.demo.service;

import jiang.demo.service.model.User;

public interface UserService {
    public User findById(int userId);

    public User findByName(String name );
}
