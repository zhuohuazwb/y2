package com.zhkkj.zwb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2018/4/12/012.
 */
@RestController
public class StudentControllers {
    @GetMapping("add")
    public String add(HttpServletRequest request){
        request.getSession().setAttribute("info","hahaha");
        return "haha";
    }
}
