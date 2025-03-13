package ua.com.kneu.groupe_202;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<String> list = List.of("C#", "Java", "C++", "Python", "PHP");

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);

        System.out.println(list1);

        list1.set(1, 10);
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);

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


        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        students.stream().forEach(el-> System.out.println(el));

         List<Student> students1 = students
                .stream()
                .sorted(Comparator.comparing(Student::getAge)).toList();

        System.out.println(students1);

        Student student1 = students.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(student1);

        Student studentMinAge =students.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(studentMinAge);

                students.parallelStream().forEach(el-> System.out.println(el));

    }


}
