package com.xxc.todo.entity;

import java.util.Date;

public class Target {
    private Integer id;     //当前目标id
    private Integer userId;     //当前用户id
    private String name;    //目标name
    private String depict;      //目标描述
    private Date endDate; //目标结束日期
    private Integer doTimes;    //打卡次数
    private Date latestDo;  //上次打卡时间

    public Target(Integer id, Integer userId, String name, String depict, Date endDate, Integer doTimes, Date latestDo) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.depict = depict;
        this.endDate = endDate;
        this.doTimes = doTimes;
        this.latestDo = latestDo;
    }


    public boolean isValid() {
        return userId != null && name != null && endDate != null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getDoTimes() {
        return doTimes;
    }

    public void setDoTimes(Integer doTimes) {
        this.doTimes = doTimes;
    }

    public Date getLatestDo() {
        return latestDo;
    }

    public void setLatestDo(Date latestDo) {
        this.latestDo = latestDo;
    }
}
