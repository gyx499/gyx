package cn.kgc.service.impl;

import cn.kgc.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("这是Service层的方法");
    }
}
