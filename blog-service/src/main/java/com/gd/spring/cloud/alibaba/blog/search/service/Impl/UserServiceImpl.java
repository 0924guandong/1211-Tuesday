package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

}

