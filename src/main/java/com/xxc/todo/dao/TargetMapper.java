package com.xxc.todo.dao;


import com.xxc.todo.entity.Target;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TargetMapper {
    public Target getTarget(Integer id);
}
