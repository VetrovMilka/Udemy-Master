package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(20, "Privet");
        System.out.println(pair1);
        OtherPair<String> pair2 = new OtherPair<>("Miroslav", "Privet");
        System.out.println(pair2);
    }
}
class Pair <T1, T2> {
    private T1 value1;
    private T2 value2;

    public Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
class OtherPair <T> {
    private T value1;
    private T value2;

    public OtherPair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
