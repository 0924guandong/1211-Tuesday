package com.gd.spring.cloud.alibaba.blog.search.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "article_tag_ref")
public class ArticleTagRef implements Serializable {
    @Id
    @Column(name = "article_id")
    private Integer articleId;

    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    private static final long serialVersionUID = 1L;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return tag_id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}