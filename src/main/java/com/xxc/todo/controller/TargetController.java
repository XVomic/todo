package com.xxc.todo.controller;

import com.xxc.todo.entity.Target;
import com.xxc.todo.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/target")
public class TargetController {
    @Autowired
    private TargetService targetService;

    @PostMapping("/addtarget")
    public int addTarget(@RequestBody Target target) {
        if(target.isValid()) {
            return targetService.addTarget(target);
        }
        return 0;
    }
}
