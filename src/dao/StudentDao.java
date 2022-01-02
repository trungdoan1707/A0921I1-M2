package dao;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private static List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student(1, "Kiên1", 21, "Đà Nẵng", "kien@gmail.com", "123456"));
        students.add(new Student(2, "Kiên2", 22, "Đà Nẵng", "kien@gmail.com", "123456"));
        students.add(new Student(3, "Kiên3", 23, "Đà Nẵng", "kien@gmail.com", "123456"));
        students.add(new Student(4, "Kiên4", 24, "Đà Nẵng", "kien@gmail.com", "123456"));
    }

    public static List<Student> getStudents() {
        return students;
    }

}
