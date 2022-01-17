package services;

import dao.StudentDao;
import models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements CRUDInterface<Student> {
    private ArrayList<Student> students = (ArrayList<Student>) StudentDao.getStudents();

    private static final String PATH = "src/data/students.csv";
    private static final String FILE_HEADER = "id,name,age,address,email,password";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    @Override
    public void add(Student student) {
        students.add(student);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Student student1 : students) {
                fileWriter.append(String.valueOf(student1.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student1.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student1.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student1.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student1.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student1.getPassword());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
        List<Student> listFromCSV = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] array;
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (count != 1) {
                    array = line.split(",");
                    int id = Integer.parseInt(array[0]);
                    String name = array[1];
                    int age = Integer.parseInt(array[2]);
                    String address = array[3];
                    String email = array[4];
                    String password = array[5];
                    listFromCSV.add(new Student(id, name, age, address, email, password));
                }
                count++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return listFromCSV;
    }


    /**
     * Method displayStudentList() use .....
     */
    public void displayStudentList() {

        students = (ArrayList<Student>) getAll();
        for (Student student : students) {
            //Tạo đối tượng scanner để người dùng nhập dữ liệu
            System.out.println(student.toString());
        }
    }
}
