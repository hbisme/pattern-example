package statePattern.CarExample2;

//    R  <-> P <-> N <-> D
public class CarClient {
    public static void main(String[] args) {
        // Car car = new Car();

        CarContext carContext = new CarContext();
        carContext.switchNeutral();
        carContext.switchNeutral();
        carContext.switchPark();
        carContext.switchDrive();
        carContext.switchReverse();
        carContext.switchNeutral();
        //
        carContext.switchPark();
        carContext.switchDrive();



        // car.switchN();
        // car.switchN();
        // car.switchP();
        // car.switchD();
        // car.switchR();
        // car.switchN();

        // car.switchP();
        // car.switchD();




        System.out.println(carContext.getState().getStateName());


    }
}
