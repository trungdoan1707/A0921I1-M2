package controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> listStudent = new LinkedList<>();
        listStudent.add("Nguyen Van B");
        listStudent.remove(1);
        listStudent.add("Nguyen Van C");
        for (String student: listStudent){
            System.out.println(student);
        }
    }
}
