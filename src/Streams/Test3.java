package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 6 ,1, 5, 2));

//       int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
//        System.out.println(result);
        // В этом случае Optional не может быть пустым, тк есть 1 - первое значение
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result2);
        List<String> list3 = new ArrayList<>(Arrays.asList("Privet", "Hello", "Guten Tag", "Hola"));
        String result = list3.stream().reduce("", (accumulator, elemnt) -> accumulator+elemnt);
        System.out.println(result);
//        Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator*element);
//        if (o.isPresent()){
//            System.out.println(o.get());
//        }
//        else {
//            System.out.println("Empty");
        }
    }

