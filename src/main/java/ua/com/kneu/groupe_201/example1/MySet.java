package ua.com.kneu.groupe_201.example1;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        Set<Student> students = new HashSet<>();
        // v.2
        Student student1 = new Student(1L,"Iva", "Pypkina", 20);
        Student student2 = new Student(2L,"Ivan", "Pypkin", 18);
        Student student3 = new Student(3L,"Vasya", "Pypkin", 25);
        Student student4 = new Student(4L,"Vasya", "Pypkin", 25);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println(students);
    }


}
