package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class ParkState implements CarState {

    private final String stateName = "P档";


    @Override
    public void switchPark(CarContext carContext) {
        System.out.println("已经在P档了, 不能换挡");

    }

    @Override
    public void switchReverse(CarContext carContext) {
        System.out.println("从P换到R档");
        carContext.setCarState(new ReverseState());
    }

    @Override
    public void switchNeutral(CarContext carContext) {
        System.out.println("从P换到N档");
        carContext.setCarState(new NeutralState());
    }

    @Override
    public void switchDrive(CarContext carContext) {
        // P档到D档需要经过N档
        switchNeutral(carContext);
        carContext.switchD();
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
