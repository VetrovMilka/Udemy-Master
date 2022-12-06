package Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static List<Car> createThreeCars(Supplier<Car> carSupplier){
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carList.add(carSupplier.get());
        }
        return carList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> ourCars = createThreeCars(() -> new Car("Nissan tilda", "Silver", 4.4));
        ourCars.forEach(System.out::println);
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 4.6;
            System.out.println("Upgraded car: " + car);
        });
        ourCars.forEach(System.out::println);
    }

}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
