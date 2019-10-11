package com.sda.dao.implementation;

import com.sda.entities.Locker;
import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;

public class LockerDaoImpl {
    public void addLocker(Locker locker){
        System.out.println("Am ajuns in clasa LockerDaoImpl");
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(locker);
        System.out.println("Locker was created");
        session.getTransaction().commit();

    }

    public Locker displayLockerById(Integer id){
        return null;
    }
    public void updateLockerById(Integer id,Integer number){

    }
    public void deleteLockerById(Integer id){}
    public void getLockerById(Locker locker){}
}
