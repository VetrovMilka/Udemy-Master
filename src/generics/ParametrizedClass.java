package generics;

import java.io.Serializable;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Miroslav");
//        String s1 = info1.getValue();
//        System.out.println(info1);

        Info<Integer> info2 = new Info<>(3);
        Integer s2 = info2.getValue();
        System.out.println(info2);

        Info<Double> info3 = new Info<>(3.14);
        Integer s3 = info2.getValue();
        System.out.println(info3);
    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}
class Info <T extends Number& Serializable&Comparable>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}
//class Parent{
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//}
//class Child extends  Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}