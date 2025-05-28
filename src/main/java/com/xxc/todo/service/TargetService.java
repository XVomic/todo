package com.xxc.todo.service;

import com.xxc.todo.entity.Target;

import java.util.List;

public interface TargetService {
    public int addTarget(Target target);

    public List<Target> getTargetByUserid(int userID);
}
