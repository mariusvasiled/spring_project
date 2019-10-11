package com.sda.dao.implementation;

import com.sda.entities.Group;
import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class GroupDaoImpl {
    public void addGroup(Group group){
        System.out.println("Am ajuns in clasa GroupDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id = (Integer) session.save(group);
            System.out.println("Group was created with id: " + id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public Student displayGroupById(Integer id) {
        return null;
    }

    public void updateGroupById(Integer id, String name) {

    }

    public void deleteGroupById(Integer id) {

    }

    public void getGroupById(Group group) {
    }
}
