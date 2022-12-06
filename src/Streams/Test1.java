package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Privet", "Hello", "Guten Tag", "Hola"));

        //
//       List<Integer> list2 = list.stream().map(String::length).toList();
//       list2.forEach(System.out::println);

       int[] array = {5, 9 ,3, 5, 1};
//        System.out.println(Arrays.toString(array));
       int[] newArr = Arrays.stream(array).map(operand -> {
           if(operand % 3 == 0) {
           operand /= 3;
           }
//           System.out.println(operand);
           return operand;
       }).toArray();
//        System.out.println(Arrays.toString(newArr));

        Set<Integer> set = Stream.of("Privet", "Hello", "Guten Tag", "Hola").map(String::length).collect(Collectors.toSet());






        set.forEach(System.out::println);
        Set<Integer> newSet = set.stream().map(e -> e).collect(Collectors.toSet());
        newSet.forEach(System.out::println);
    }
}
