package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("Computer Science");
        student.setDate(new Date());
        System.out.println(student.getName() + " is a student of group: " + student.getGroup() + " from "
                + student.getDate());
    }
}
