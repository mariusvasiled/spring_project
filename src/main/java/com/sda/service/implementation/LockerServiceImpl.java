package com.sda.service.implementation;

import com.sda.entities.Locker;
import com.sda.repo.LockerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerServiceImpl {


    private LockerRepo lockerRepo;

    public void addLocker(Locker locker) {
        System.out.println("Am ajuns in clasa LockerService");
        getLockerRepo().createLocker(locker);
    }

    public LockerRepo getLockerRepo() {
        return lockerRepo;
    }

    @Autowired
    public void setLockerRepo(LockerRepo lockerRepo) {
        this.lockerRepo = lockerRepo;
    }

}
