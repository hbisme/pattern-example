package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class DriveState implements CarState {

    private final String stateName = "D档";

    @Override
    public void switchPark(CarContext carContext) {
        switchNeutral(carContext);
        carContext.switchP();
    }

    @Override
    public void switchReverse(CarContext carContext) {
        switchPark(carContext);
        carContext.switchR();
    }

    @Override
    public void switchNeutral(CarContext carContext) {
        System.out.println("从D档换到N档");
        carContext.setCarState(new NeutralState());
    }

    @Override
    public void switchDrive(CarContext carContext) {
        System.out.println("已经在D档,不能换档");
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
