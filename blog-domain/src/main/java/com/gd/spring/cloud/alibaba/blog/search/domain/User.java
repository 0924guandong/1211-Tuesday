package com.gd.spring.cloud.alibaba.blog.search.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`user`")
public class User implements Serializable {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "JDBC")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "user_nickname")
    private String userNickname;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_url")
    private String userUrl;

    @Column(name = "user_avatar")
    private String userAvatar;

    @Column(name = "user_last_login_ip")
    private String userLastLoginIp;

    @Column(name = "user_register_time")
    private Date userRegisterTime;

    @Column(name = "user_last_login_time")
    private Date userLastLoginTime;

    @Column(name = "user_status")
    private Integer userStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_pass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * @return user_nickname
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * @param userNickname
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * @return user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return user_url
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * @param userUrl
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     * @return user_avatar
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * @param userAvatar
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * @return user_last_login_ip
     */
    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    /**
     * @param userLastLoginIp
     */
    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    /**
     * @return user_register_time
     */
    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    /**
     * @param userRegisterTime
     */
    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    /**
     * @return user_last_login_time
     */
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    /**
     * @param userLastLoginTime
     */
    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    /**
     * @return user_status
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * @param userStatus
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}