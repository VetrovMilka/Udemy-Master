package Lambda_Expressions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentInfo {

    void testStudents(List<Student> list, Predicate<Student> predicate) {
        for (Student s : list) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 19, 2, 9.1);
        Student st2 = new Student("Miroslav", 'm', 19, 2, 7.7);
        Student st3 = new Student("Eva", 'f', 18, 1, 6.6);
        Student st4 = new Student("Rafah", 'f', 21, 2, 8.4);
        Student st5 = new Student("Dima", 'm', 21, 3, 8.7);
        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));

        StudentInfo studentInfo = new StudentInfo();


//        int result = avgOfSmth(students, student -> student.age);
//        System.out.println(result);

//        System.out.println("------------------------");
//        studentInfo.testStudents(students, s -> s.age < 20);
//        System.out.println("------------------------");
//        studentInfo.testStudents(students, s -> s.avgGrade > 8.0);
//        System.out.println("------------------------");
//        studentInfo.testStudents(students, s -> s.age < 21 && s.avgGrade > 8 && s.sex == 'm');
//        Predicate<Student> p1 = s -> s.age < 20;
//        Predicate<Student> p2 = s -> s.sex == 'm';
//        studentInfo.testStudents(students, p1.negate());
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        students.sort((s1, s2) -> s1.course - s2.course);
//        students.forEach(System.out::println);
//        List<Student> newList = students.stream().filter(student -> student.avgGrade>7.8 && student.age>18).toList();
//        newList.forEach(System.out::println);
//       students = students.stream().sorted(Comparator.comparing(x -> x.name)).collect(Collectors.toList());
//       students.forEach(System.out::println);

        //имена заглавные, только девушки, отсортировать по возрасту

//        students.stream()
//                .filter(e -> e.sex=='f')
//                .map(e -> {
//                    e.name = e.name.toUpperCase(Locale.ROOT);
//                    return e;
//                })
//                .sorted((Comparator.comparing(z -> z.age)))
//                .toList()
//                .forEach(System.out::println);
        Student student = students.stream()
                .filter(e -> e.sex=='f')
                .map(e -> {
                    e.name = e.name.toUpperCase(Locale.ROOT);
                    return e;
                })
                .sorted((Comparator.comparing(z -> z.age)))
                .findFirst().get();
    }


    private static int avgOfSmth(List<Student> listOfStudents, Function<Student, Integer> function){
        int result = 0;

        for (Student student : listOfStudents){
            result += function.apply(student);
        }
        result = result / listOfStudents.size();
        return result;
    }
}
//
//interface StudentChecks {
//    boolean check(Student s);
//}
