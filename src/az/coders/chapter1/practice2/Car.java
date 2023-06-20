package az.coders.chapter1.practice2;

public class Car {
    String brand;
    Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car myCar = new Car("BMW", new Engine(5500));
    }

}
class Engine{
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
}
