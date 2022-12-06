package AnonymousClass;

public class Tets1 {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        Math math2 = new Math() {
            @Override
            public int operation(int a, int b) {
                return a*b;
            }
        };
        int i =
        System.out.println(math.operation(5,10));
    }
}

interface Math{
    int operation(int a, int b);
}
