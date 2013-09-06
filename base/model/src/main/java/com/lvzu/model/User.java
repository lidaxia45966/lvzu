package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午3:43
 * Description:
 */
public class User extends Id {

    private String userName;
    private String nickName;
    private String password;
    private String gender;
    private Date registerTime;
    private Date updateTime;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
