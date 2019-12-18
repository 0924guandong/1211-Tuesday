package com.gd.spring.cloud.alibaba.blog.search.mapper;

import com.gd.spring.cloud.alibaba.blog.search.domain.Article;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface ArticleMapper extends MyMapper<Article> {

    List<Article> listAllNotWithContent();

}