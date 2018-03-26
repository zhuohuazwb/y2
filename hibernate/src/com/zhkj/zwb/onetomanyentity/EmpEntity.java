package com.zhkj.zwb.onetomanyentity;

/**
 * Created by Administrator on 2018/3/16/016.
 */
public class EmpEntity {
    private String eid;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DeptEntity getDept() {
        return dept;
    }

    public void setDept(DeptEntity dept) {
        this.dept = dept;
    }

    private String ename;
    private DeptEntity dept;
}
