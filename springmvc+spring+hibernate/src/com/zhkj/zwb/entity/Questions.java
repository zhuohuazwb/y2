package com.zhkj.zwb.entity;

import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.Date;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/20/020.
 */
public class Questions {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtailDesc() {
        return ctailDesc;
    }

    public void setCtailDesc(String ctailDesc) {
        this.ctailDesc = ctailDesc;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public Date getFastModified() {
        return fastModified;
    }

    public void setFastModified(Date fastModified) {
        this.fastModified = fastModified;
    }

    private int id;
    private String title;
    private String ctailDesc;
    private int answerCount;
    private Date fastModified;

    public Set<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Questions> questions) {
        this.questions = questions;
    }

    private Set<Questions> questions;

}
