package com.sda.entryPoints;

import com.sda.entities.Group;
import com.sda.entities.Locker;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.service.implementation.GroupServiceImpl;
import com.sda.service.implementation.LockerServiceImpl;
import com.sda.service.implementation.StudentServiceImpl;
import com.sda.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntryPoints {
    private StudentServiceImpl studentService;
    private TeacherServiceImpl teacherService;
    private LockerServiceImpl lockerService;
    private GroupServiceImpl groupService;

    public TeacherServiceImpl getTeacherService() {
        return teacherService;
    }

    @Autowired
    public void setTeacherService(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    public void executeTeacher() {
        System.out.println("Am ajuns in clasa EntryPoints");
        Teacher teacher = new Teacher();
        teacher.setName("Paul Moraru");
        teacher.setAge(55);
        teacher.setDiscipline("Mineralogy");
        getTeacherService().addTeacher(teacher);
    }


    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void executeStudent() {
        System.out.println("Am ajuns in clasa EntryPoints");
        Student student = new Student();
        student.setName("Ionut Mircea");
        student.setAge(21);
        student.setAverage_grade(7);
        getStudentService().addStudent(student);
    }

    public LockerServiceImpl getLockerService() {
        return lockerService;
    }

    @Autowired
    public void setLockerService(LockerServiceImpl lockerService) {
        this.lockerService = lockerService;
    }


    public void executeLocker() {
        System.out.println("Am ajuns in clasa EntryPoints");
        Locker locker = new Locker();
        locker.setNumber(12);
    }

    public GroupServiceImpl getGroupService() {
        return groupService;
    }

    @Autowired
    public void setGroupService(GroupServiceImpl groupService) {
        this.groupService = groupService;
    }
    public void executeGroup(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Group group = new Group();
        group.setName("Limba Rusa");
    }
}
