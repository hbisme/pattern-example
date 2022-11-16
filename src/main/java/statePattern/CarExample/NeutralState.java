package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class NeutralState implements CarState {

    private final String stateName = "N档" ;

    @Override
    public void switchPark(Car car) {
        System.out.println("从N档换到P档");
        car.setCarState(new ParkState());
    }

    @Override
    public void switchReverse(Car car)
    {
        switchPark(car);
        car.switchR();
    }

    @Override
    public void switchNeutral(Car car) {
        System.out.println("已经是N档,不能换挡");
    }

    @Override
    public void switchDrive(Car car) {
        System.out.println("从N档换到D档");
        car.setCarState(new DriveState());
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
