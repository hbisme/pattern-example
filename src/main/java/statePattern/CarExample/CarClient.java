package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class CarClient {
    public static void main(String[] args) {
        CarContext carContext = new CarContext();

        carContext.switchN();
        carContext.switchN();
        carContext.switchP();
        carContext.switchD();
        carContext.switchR();
        carContext.switchN();

        carContext.switchP();
        carContext.switchD();




        System.out.println(carContext.getCarState().getStateName());


    }
}
