package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class NeutralState implements CarState {

    private final String stateName = "N档" ;

    @Override
    public void switchPark(CarContext carContext) {
        System.out.println("从N档换到P档");
        carContext.setCarState(new ParkState());
    }

    @Override
    public void switchReverse(CarContext carContext)
    {
        switchPark(carContext);
        carContext.switchR();
    }

    @Override
    public void switchNeutral(CarContext carContext) {
        System.out.println("已经是N档,不能换挡");
    }

    @Override
    public void switchDrive(CarContext carContext) {
        System.out.println("从N档换到D档");
        carContext.setCarState(new DriveState());
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
