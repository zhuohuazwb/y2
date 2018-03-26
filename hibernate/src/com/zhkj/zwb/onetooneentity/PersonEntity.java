package com.zhkj.zwb.onetooneentity;

/**
 * Created by Administrator on 2018/3/15/015.
 */
public class PersonEntity {
    private String pid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public CardEntity getCard() {
        return card;
    }

    public void setCard(CardEntity card) {
        this.card = card;
    }

    private String pname;
    private CardEntity card;
}
