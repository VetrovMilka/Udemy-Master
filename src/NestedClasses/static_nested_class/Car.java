package NestedClasses.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method (){
        System.out.println(Engine.count + " " + engine.horsePower);
    }
    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public static class Engine{
        private int horsePower;
        static int count;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
            count++;
            System.out.println(a);
            System.out.println(new Car("green", 2, this).doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("Green", 2, engine);
        System.out.println(car);
    }
}
