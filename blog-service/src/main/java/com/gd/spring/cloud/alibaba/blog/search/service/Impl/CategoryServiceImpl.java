package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

}

