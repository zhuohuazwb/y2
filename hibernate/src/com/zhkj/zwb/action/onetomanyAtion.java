package com.zhkj.zwb.action;

import com.zhkj.zwb.onetomanyentity.DeptEntity;
import com.zhkj.zwb.onetomanyentity.EmpEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/16/016.
 */
public class onetomanyAtion {
    private static SessionFactory sessionFactory;
    static {
        Configuration cfg=new Configuration().configure();
        sessionFactory=cfg.buildSessionFactory();
    }

    public static void main(String[] args) {
        EmpEntity emp=new EmpEntity();
        emp.setEname("张三");
        EmpEntity emp1=new EmpEntity();
        emp1.setEname("李四");
        DeptEntity deptEntity=new DeptEntity();
        deptEntity.setDname("研发部");
//        deptEntity.setDid("4028ab41622d6dd601622d6dda150000");
        Set<EmpEntity> set=new HashSet<EmpEntity>();
        set.add(emp);
        set.add(emp1);
        deptEntity.setEmp(set);
//        add(deptEntity);
//        update(deptEntity);
        DeptEntity dept=getDept("4028ab41622dd6ee01622dd6f27f0000");
//        dept.setDname(dept.getDname()+"1");
//        for (EmpEntity e:dept.getEmp()){
//            e.setEname(e.getEname()+"1");
//        }
//        update(dept);
        delete(dept);
    }
    private static DeptEntity getDept(String id){
        Session session=sessionFactory.openSession();
        DeptEntity deptEntity=session.get(DeptEntity.class,id);
        session.close();
        return deptEntity;
    }
    private static void add(DeptEntity deptEntity){
        Session session=sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        session.save(deptEntity);
        t.commit();
        session.close();
    }
    private static void update(DeptEntity deptEntity){
        Session session=sessionFactory.openSession();
        Transaction T=session.beginTransaction();
        session.update(deptEntity);
        T.commit();
        session.close();
    }
    private static void delete(DeptEntity deptEntity){
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.delete(deptEntity);
        t.commit();
        session.close();
    }
}
