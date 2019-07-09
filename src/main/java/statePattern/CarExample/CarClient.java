package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class CarClient {
    public static void main(String[] args) {
        Car car = new Car();

        car.switchN();
        car.switchN();
        car.switchP();
        car.switchD();
        car.switchR();
        car.switchN();

        car.switchP();
        car.switchD();




        System.out.println(car.getCarState());


    }
}
