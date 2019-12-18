package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.NoticeMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Resource
    private NoticeMapper noticeMapper;

}

