package Streams;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 2, 9.1);
        Student st2 = new Student("Miroslav", 'm', 19, 2, 7.7);
        Student st3 = new Student("Eva", 'f', 18, 1, 6.6);
        Student st4 = new Student("Rafah", 'f', 21, 2, 8.4);
        Student st5 = new Student("Dima", 'm', 21, 3, 8.7);
        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));

//       Student student = students.stream().min((x, y) -> (int) (x.getAvgGrade()-y.getAvgGrade())).get();
//       System.out.println(student);
//        Student student2 = students.stream().max((x, y) -> (int) (x.getAvgGrade()-y.getAvgGrade())).get();
//        System.out.println(student2);
//        List<Student> limitedstudents = students.stream().filter(e -> e.getAge()>18).limit(2).toList();
//        limitedstudents.forEach(System.out::println);
//        List<Student> limitedstudents = students.stream().filter(e -> e.getAge()>18).skip(2).toList();
//        limitedstudents.forEach(System.out::println);

        List<Integer> courses =students.stream().mapToInt(e -> e.getCourse()).boxed().toList();
        courses.forEach(System.out::println);
    }
}
