package com.xxc.todo.service.impl;

import com.xxc.todo.dao.TargetMapper;
import com.xxc.todo.entity.Target;
import com.xxc.todo.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetServiceImpl implements TargetService {

    @Autowired
    TargetMapper targetMapper;

    @Override
    public int addTarget(Target target) {
        int added = targetMapper.addTarget(target);
        return added;
    }

    @Override
    public List<Target> getTargetByUserid(int userId) {
        List<Target> targetList = targetMapper.getAllTargetByUserid(userId);
        return targetList;
    }
}
