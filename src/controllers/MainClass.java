package controllers;

import models.Student;
import services.StudentService;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("-------------Student Management System-----------------");
            System.out.println("Menu System");
            System.out.println("1. Display list student");
            System.out.println("2. Add new student");
            System.out.println("3. Delete student");
            System.out.println("4. Edit student");
            System.out.println("0. Exits system");
            System.out.print("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentService.displayStudentList();
                    break;
                case 2:
                    studentService.add(inputNewStudent());
                    break;
                case 3:
//                    studentService.delete();
                    break;
                case 4:
//                    studentService.edit();
                    break;
                case 0:
                    System.out.println("Chương trình đang tắt...");
                    System.exit(0);
                default:
                    System.out.println("Chức năng bạn chọn không có trong hệ thống");
            }
        }
    }

    public static Student inputNewStudent() {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String address = scanner.nextLine();
        String email = scanner.nextLine();
        String password = scanner.nextLine();
        Student student = new Student(id, name, age, address, email, password);
        return student;
    }


}
