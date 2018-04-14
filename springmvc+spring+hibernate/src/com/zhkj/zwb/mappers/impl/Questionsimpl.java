package com.zhkj.zwb.mappers.impl;

import com.zhkj.zwb.entity.Questions;
import com.zhkj.zwb.mappers.questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20/020.
 */
@Repository
public class Questionsimpl extends HibernateDaoSupport implements questions {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public Questions select(int id) {
        return hibernateTemplate.get(Questions.class,id);

    }
}
