package ua.com.kneu.groupe_203.unit2;

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

        list.set(0,10);
        System.out.println(list);

        list.add(1,1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list.clear();

        System.out.println(list);

        // v1.
        Student student1 = new Student();
        student1.setId(4L);
        student1.setFirstName("Iva");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        Student student2 = new Student(2L, "Vasya", "Pypkin",20);

        Student student3 = new Student(3L, "Vasya", "Pypkin",20);

        Student student4 = new Student(1L, "Ivan", "Pypkin",24);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        students.stream().forEach(el-> System.out.println(el));

        Student studentMinAge = students.stream()
                                                .min(Comparator.comparing(Student::getAge))
                                                .get();
        System.out.println(studentMinAge);
        Student studentMaxAge = students.stream()
                                                 .max(Comparator.comparing(Student::getAge))
                                                 .get();
        System.out.println(studentMaxAge);

        students.stream().filter(el-> el.getAge() >= 20).forEach(el-> System.out.println(">20:" + el));

        List<Student> students1 = students.stream().sorted(Comparator.comparing(Student::getAge)).toList();

        System.out.println(students1);

    }





}
