package com.zhkj.zwb.controller;
import com.zhkj.zwb.entity.Questions;
import com.zhkj.zwb.mappers.questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/20/020.
 */
@RestController
public class Question {
    @Autowired
    questions studentinterfaceimpl;
    @RequestMapping("/orderId/{id}")
    public Questions byIdselet(@PathVariable("orderId") int id){
        Questions questions= studentinterfaceimpl.select(id);
        return questions;
    }
}
