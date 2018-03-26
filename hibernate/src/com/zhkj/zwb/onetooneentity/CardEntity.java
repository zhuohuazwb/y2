package com.zhkj.zwb.onetooneentity;

/**
 * Created by Administrator on 2018/3/15/015.
 */
public class CardEntity {
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    private String cid;
    private String cnum;
    private PersonEntity person;
}
