package Streams;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 6 ,1 ,4, 15, 23, 26, 58, 35,245};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array)
                .filter(e ->
                     e % 2 == 1
                    )
                .map(e -> {
                    if(e%3==0) {
                        e/=3;
                    }
                    return e;}
                )
                .reduce((accum, elem) -> accum+=elem).getAsInt();
        System.out.println(result);

    }
}
