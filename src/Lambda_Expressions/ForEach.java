package Lambda_Expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Privet", "Hello", "Guten Tag", "Hola"));
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.forEach(s -> System.out.println(s));
    }
}
