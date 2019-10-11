package com.sda.repo;

import com.sda.dao.implementation.GroupDaoImpl;
import com.sda.entities.Group;
import com.sda.service.implementation.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GroupRepo {
    private GroupDaoImpl groupDao;

    public void createGroup(Group group) {
        System.out.println("Am ajuns in clasa GroupRepo");
        getGroupDao().addGroup(group);
    }

    public GroupDaoImpl getGroupDao() {
        return groupDao;
    }

    @Autowired
    public void setGroupDao(GroupDaoImpl groupDao) {
        this.groupDao = groupDao;
    }
}
