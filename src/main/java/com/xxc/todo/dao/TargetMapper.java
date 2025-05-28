package com.xxc.todo.dao;


import com.xxc.todo.entity.Target;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TargetMapper {

     int addTarget(Target target);

     List<Target> getAllTargetByUserid(int userId);

}
