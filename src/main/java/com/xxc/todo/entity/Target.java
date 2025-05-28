package com.xxc.todo.entity;

import java.util.Date;

public class Target {
    private Integer id;     //当前目标id
    private Integer userID;     //当前用户id
    private String name;    //目标name
    private String depict;      //目标描述
    private Date endDate; //目标结束日期
    private Integer dotimes;    //打卡次数
    private Date latestdo;  //上次打卡时间

    public Target(Integer id, Integer userID, String name, String depict, Date endDate, Integer dotimes, Date latestdo) {
        this.id = id;
        this.userID = userID;
        this.name = name;
        this.depict = depict;
        this.endDate = endDate;
        this.dotimes = dotimes;
        this.latestdo = latestdo;
    }

    public Target() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDotimes() {
        return dotimes;
    }

    public void setDotimes(Integer dotimes) {
        this.dotimes = dotimes;
    }

    public Date getLatestdo() {
        return latestdo;
    }

    public void setLatestdo(Date latestdo) {
        this.latestdo = latestdo;
    }

    public boolean isValid() {
        return userID != null && name != null && endDate != null;
    }
}
