package com.xxc.todo.entity;

import java.util.Date;

public class Target {
    private Integer id;     //当前目标id
    private Integer userID;     //当前用户id
    private String name;    //目标name
    private String depict;      //目标描述
    private String endDate; //目标结束日期
    private Integer dotimes;    //打卡次数
    private Date latestdo;  //上次打卡时间
}
