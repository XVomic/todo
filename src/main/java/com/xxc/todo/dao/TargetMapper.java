package com.xxc.todo.dao;


import com.xxc.todo.entity.Target;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TargetMapper {
     List<Target> getAllTargetByUserid(int userid);

     int addTarget(Target target);
}
