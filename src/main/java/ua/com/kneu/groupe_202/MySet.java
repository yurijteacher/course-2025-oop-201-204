package ua.com.kneu.groupe_202;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        // v.1
        Student student = new Student();
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(20);
        student.setId(1L);

        // v.2

        Student student2 = new Student(2L, "Iva","Pypkina", 18);
        Student student3 = new Student(3L, "Ivan","Pypkin", 25);

        Student student4 = new Student(4L, "Vasya","Pypkin", 20);

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        students
                .stream()
                .toList()
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(e -> System.out.println(e));

    }





}
