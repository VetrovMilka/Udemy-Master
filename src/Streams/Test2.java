package Streams;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 6 ,1 ,4};
//        Arrays.stream(array).forEach(value -> {
//            value *= 2;
//            System.out.println(value);
//        });
//        Arrays.stream(array).forEach(System.out::println);
          Arrays.stream(array).forEach(Utils::myMethod);
    }

}
class Utils{
    public static void myMethod(int a){
        System.out.println("Element = " + a*2);
    }
}
