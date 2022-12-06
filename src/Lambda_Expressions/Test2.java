package Lambda_Expressions;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> 19);
    }
}
interface I {
    int abc ();
}
