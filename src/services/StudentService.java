package services;

import dao.StudentDao;
import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements CRUDInterface<Student> {
    private ArrayList<Student> students = (ArrayList<Student>) StudentDao.getStudents();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void edit(Student student, int id) {
        System.out.println("Sửa thông tin Student");
    }

    @Override
    public void delete(int id) {
        System.out.println("Xóa thông tin Student");
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    /**
     * Method displayStudentList() use .....
     */
    public void displayStudentList(){
        for (Student student : students){
            //Tạo đối tượng scanner để người dùng nhập dữ liệu
            Scanner scanner = new Scanner(System.in);
            System.out.println(student.toString());
        }
    }
}
