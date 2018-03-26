package com.zhkj.zwb.onetomanyentity;

import java.util.Set;

/**
 * Created by Administrator on 2018/3/16/016.
 */
public class DeptEntity {
    private String did;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<EmpEntity> getEmp() {
        return emp;
    }

    public void setEmp(Set<EmpEntity> emp) {
        this.emp = emp;
    }

    private String dname;
    private Set<EmpEntity> emp;
}
