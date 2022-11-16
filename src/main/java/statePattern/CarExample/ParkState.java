package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class ParkState implements CarState {

    private final String stateName = "P档";


    @Override
    public void switchPark(Car car) {
        System.out.println("已经在P档了, 不能换挡");

    }

    @Override
    public void switchReverse(Car car) {
        System.out.println("从P换到R档");
        car.setCarState(new ReverseState());
    }

    @Override
    public void switchNeutral(Car car) {
        System.out.println("从P换到N档");
        car.setCarState(new NeutralState());
    }

    @Override
    public void switchDrive(Car car) {
        // P档到D档需要经过N档
        switchNeutral(car);
        car.switchD();
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
