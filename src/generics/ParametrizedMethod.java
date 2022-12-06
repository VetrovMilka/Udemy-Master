package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ParametrizedMethod {
    public static void main(String[] args) {
//        String result = GenMethod.getSecondElement(new ArrayList<>(Arrays.asList("Pelimenika", "Syrnik", "Zlata")));
//        System.out.println(result);
        Integer result2 = GenMethod.getSecondElement(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println(result2);

    }
}
class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> all){
        return all.get(1);
    }
}


