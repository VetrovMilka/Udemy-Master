package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        // List<Number> list2 = new ArrayList<Integer>();
        // List<Object> list = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();

        List<String> list2 = new ArrayList<>(Arrays.asList("milka", "genius", "lol"));
        ArrayList<Double> list3 = new ArrayList<>(Arrays.asList(3.13, 3.14, 3.15));
        List <? extends Number> list4 = new ArrayList<Integer>();
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(3, 34, 35));
        List <? super Number> list6 = new ArrayList<Object>();

        showList(list2);
        showList(list3);

        System.out.println(summ(list3));
        System.out.println(summ(list5));
    }
    static void showList(List<?> list){
        System.out.println("My list contains next elements : " + list);
    }
    static double summ(ArrayList<? extends Number> list){
        double summ = 0;
        for (Number number : list){
            summ += number.doubleValue();
        }
        return summ;
    }
}
