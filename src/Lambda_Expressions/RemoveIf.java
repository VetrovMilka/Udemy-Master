package Lambda_Expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Privet", "Hello", "Guten Tag", "Hola"));
        list.removeIf(string -> string.length()>5);
        list.forEach(System.out::println);
    }
}
