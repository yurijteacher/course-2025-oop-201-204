package ua.com.kneu.groupe_203.unit2;

import ua.com.kneu.unit5.Info;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1);
        System.out.println(list);

        Set<Student> students = new HashSet<>();

        Student student4 = new Student(1L, "Ivan", "Pypkin",24);
        Student student2 = new Student(2L, "Vasya", "Pypkin",20);
        Student student3 = new Student(3L, "Vasya", "Pypkin",20);

        Student student1 = new Student();
        student1.setId(4L);
        student1.setFirstName("Iva");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);





    }




}
