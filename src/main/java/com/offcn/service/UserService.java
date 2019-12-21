package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;


public interface UserService {

    void deleteById(Integer id);

    void update(User user);

    void save(User user);

    User findOne(Integer id);

    List<User> findAll();
}
