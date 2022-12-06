package Streams;

import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1, 4, 2, 5, 3, 6, 3);
//        Stream<Integer> stream2 = Stream.of(8, 23, 8, 3, 6 ,2);
//        Stream<Integer> stream3 = Stream.of(2, 578, 8, 3, 6, 34);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        stream4.forEach(System.out::println);
        Stream<Integer> stream5 = Stream.of(8, 23, 8, 3, 6 ,2);
//        stream5.distinct().forEach(System.out::println);

        System.out.println(stream5.distinct().count());
    }
}
