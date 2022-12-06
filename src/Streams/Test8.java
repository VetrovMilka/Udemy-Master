package Streams;

import Lambda_Expressions.Student;
import Lambda_Expressions.StudentInfo;

import java.util.*;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 2, 9.1);
        Student st2 = new Student("Miroslav", 'm', 19, 2, 7.7);
        Student st3 = new Student("Eva", 'f', 18, 1, 6.6);
        Student st4 = new Student("Rafah", 'f', 21, 2, 8.4);
        Student st5 = new Student("Dima", 'm', 21, 3, 8.7);
        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));

        StudentInfo studentInfo = new StudentInfo();

//        Map<Integer, List<Student>> map = students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase(Locale.ROOT));
//            return el;
//        })
//                .collect(Collectors.groupingBy(Student::getCourse));
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map =
                students.stream()
                .collect(Collectors.partitioningBy(e -> e.getAvgGrade()>7.8));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
