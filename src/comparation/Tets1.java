package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tets1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Miroslav");
        list.add("Ivan");
        list.add("Zlata");
        System.out.println("Before the sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After the sort");
        System.out.println(list);

    }
}
