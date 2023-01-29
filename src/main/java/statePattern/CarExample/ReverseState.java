package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class ReverseState implements CarState{

    private final String stateName = "R档";

    @Override
    public void switchPark(CarContext carContext) {
        System.out.println("从R档换到P档位");
        carContext.setCarState(new ParkState());
    }

    @Override
    public void switchReverse(CarContext carContext) {
        System.out.println("已经在R档,不能换挡");
    }

    @Override
    public void switchNeutral(CarContext carContext) {
        switchPark(carContext);
        carContext.switchN();
    }

    @Override
    public void switchDrive(CarContext carContext) {
        switchNeutral(carContext);
        carContext.switchD();
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
