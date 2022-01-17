package dao;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private static List<Student> students;

    static {
        students = new ArrayList<>();
    }

    public static List<Student> getStudents() {
        return students;
    }

}
