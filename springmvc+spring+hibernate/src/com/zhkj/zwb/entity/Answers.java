package com.zhkj.zwb.entity;

import javax.naming.ldap.PagedResultsControl;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/20/020.
 */
public class Answers {
    private int id;
    private String ansContent;

    public Date getAnsDate() {
        return ansDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public void setAnsDate(Date ansDate) {
        this.ansDate = ansDate;
    }

    private Date ansDate;
    private int qid;

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    private Questions questions;

}
