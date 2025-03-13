package ua.com.kneu.groupe_204.unit1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(list);

        list.add(1,10);
        System.out.println(list);

        list.add(2,20);

        list.remove(0);
        System.out.println(list);

        list.clear();
        System.out.println(list);


        List<Student> students = new ArrayList<>();

        // v.1
        Student student1 = new Student();
        student1.setId(1L);
        student1.setFirstName("Vasya");
        student1.setLastName("Pypkin");
        student1.setAge(20);
        // v.2

        Student student2 = new Student(2L, "Iva", "Pypkina", 18);
        Student student3 = new Student(3L, "Ivan", "Pypkin", 25);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        //

        students
                .stream()
                .forEach(el-> System.out.println(el));

        for (Student student : students) {
            System.out.println(student);
        }

        Student studentByMinAge = students.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(studentByMinAge);

        Student studentByMaxAge = students.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(studentByMaxAge);


        List<Student> students1 = students
                .stream()
                .sorted(Comparator.comparing(Student::getAge)).toList();

        System.out.println(students1);

        Student student4 = new Student(3L, "Ivan", "Pypkin", 25);


        students.add(student4);
        System.out.println(students);

    }


}
