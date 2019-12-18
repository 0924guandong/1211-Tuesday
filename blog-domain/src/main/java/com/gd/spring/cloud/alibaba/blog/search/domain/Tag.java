package com.gd.spring.cloud.alibaba.blog.search.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tag")
public class Tag implements Serializable {
    @Id
    @Column(name = "tag_id")
    @GeneratedValue(generator = "JDBC")
    private Integer tagId;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_description")
    private String tagDescription;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return tag_name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return tag_description
     */
    public String getTagDescription() {
        return tagDescription;
    }

    /**
     * @param tagDescription
     */
    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }
}