package com.zhkj.zwb.action;

import com.zhkj.zwb.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/3/6/006.
 */
public class StudentAction {
    private static SessionFactory sessionFactory;
    static {
        Configuration cfg=new Configuration().configure();
        sessionFactory=cfg.buildSessionFactory();
    }
    public static void main(String[] args) {
//        Student studentEntity=new Student();
//        studentEntity.setAge(20);
//        studentEntity.setStudentName("hahaha");
//        create(studentEntity);
//        List<Student> list1=select(20);
//        for (Student t:list1){
//            System.out.println("姓名："+t.getStudentName()+"    "+"年龄："+t.getAge());
//        }
    }
    public static void create(Student studentEntity){
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.save(studentEntity);
        t.commit();
        session.close();
    }
    public static List<Student> select(int age1){
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from com.zhkj.zwb.entity.Student where age=?");
        query.setInteger(0,age1);
        List<Student> list=query.list();
        session.close();
        return list;
    }
    public static List<Student> getStudnet(){
        Session session=sessionFactory.openSession();
        return null;
    }
}
