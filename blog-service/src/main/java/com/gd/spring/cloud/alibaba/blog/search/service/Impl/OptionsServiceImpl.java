package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.OptionsMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.OptionsService;

@Service
public class OptionsServiceImpl implements OptionsService {

    @Resource
    private OptionsMapper optionsMapper;

}

