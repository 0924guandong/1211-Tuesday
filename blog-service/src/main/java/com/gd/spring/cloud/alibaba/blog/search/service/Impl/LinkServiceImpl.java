package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.LinkMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService {

    @Resource
    private LinkMapper linkMapper;

}

