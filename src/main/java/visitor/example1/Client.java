package visitor.example1;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.addVisit(new Body());
        car.addVisit(new Engine());

        Visitor print = new PrintCar();
        car.show(print);

    }
}
