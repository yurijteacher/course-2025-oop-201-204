package ua.com.kneu.groupe_204.unit1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MySet {

    // psvm + [Tab]

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);


        Set<Student> students = new HashSet<>();

        // v.1
        Student student1 = new Student();
        student1.setId(1L);
        student1.setFirstName("Vasya");
        student1.setLastName("Pypkin");
        student1.setAge(20);
        // v.2

        Student student2 = new Student(2L, "Iva", "Pypkina", 18);
        Student student3 = new Student(3L, "Ivan", "Pypkin", 25);
        Student student4 = new Student(4L, "Ivan", "Pypkin", 25);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);


        students
                .stream()
                .collect(Collectors.toSet())
                .stream()
                .filter(e->e.getAge()>19)
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);





    }


}
