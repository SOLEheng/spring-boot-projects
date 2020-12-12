package com.itheng.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

/**
 * @Author PV-CZH mail:zilemontree@yeah.net
 * @description 实体类LoginUser
 * @Date 2020/12/12 9:45
 * @title: LoginUser
 * @projectName spring-boot-shiyanlou-projects
 */
@Component
public class LoginUser {
    private Integer loginUserId;
    private String loginUserName;
    private Integer age;

    public Integer getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(Integer loginUserId) {
        this.loginUserId = loginUserId;
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "loginUserId=" + loginUserId +
                ", age=" + age +
                '}';
    }
}
