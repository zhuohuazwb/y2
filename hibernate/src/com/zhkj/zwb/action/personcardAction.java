package com.zhkj.zwb.action;

import com.zhkj.zwb.onetooneentity.CardEntity;
import com.zhkj.zwb.onetooneentity.PersonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.jaxb.SourceType;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Created by Administrator on 2018/3/15/015.
 */
public class personcardAction {
    private static SessionFactory sessionFactory;
    static {
        Configuration cfg=new Configuration().configure();
        sessionFactory=cfg.buildSessionFactory();
    }

    public static void main(String[] args) {
        PersonEntity personEntity=new PersonEntity();
        personEntity.setPid("1");
        personEntity.setPname("lisi");
        CardEntity cardEntity=new CardEntity();
        cardEntity.setCid("1");
        cardEntity.setCnum("620522199601012251");
        personEntity.setCard(cardEntity);
//        add(personEntity);
//        update(personEntity);
//        delect(personEntity);
       String name=nameByCID("620522199601012251");
        System.out.println(name);
    }
    public static void add(PersonEntity personEntity){
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.save(personEntity);
        t.commit();
        session.close();
    }
    public static void update(PersonEntity personEntity){
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.update(personEntity);
        t.commit();
        session.close();
    }
    public static void delect(PersonEntity personEntity){
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.delete(personEntity);
        t.commit();
        session.close();
    }
    /**
     * 根据编号名称
     */
    public static String nameByCID(String CNUM){
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("select c.person.pname from CardEntity c where c.cnum=:cnum");
        query.setString("cnum",CNUM);
        String name=(String) query.uniqueResult();
        return name;
    }
}
