import models.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
       Set<Student> students = new HashSet<>();
       students.add(new Student(1, "Kien1",23, "Da Nang", "kein@gmail.com","123"));
       students.add(new Student(2, "Kien2",23, "Da Nang", "kein@gmail.com","123"));
       students.add(new Student(3, "Kien3",23, "Da Nang", "kein@gmail.com","123"));
       students.add(new Student(4, "Kien4",23, "Da Nang", "kein@gmail.com","123"));
       students.add(new Student(5, "Kien5",23, "Da Nang", "kein@gmail.com","123"));
       students.add(new Student(3, "Kien3",23, "Da Nang", "kein@gmail.com","123"));

       for (Student student : students){
           System.out.println(student.toString());
       }

    }
}
