package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.CommentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

}

