package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class DriveState implements CarState {
    @Override
    public void switchPark(Car car) {
        switchNeutral(car);
        car.switchP();
    }

    @Override
    public void switchReverse(Car car) {
        switchPark(car);
        car.switchR();
    }

    @Override
    public void switchNeutral(Car car) {
        System.out.println("从D档换到N档");
        car.setCarState(new NeutralState());
    }

    @Override
    public void switchDrive(Car car) {
        System.out.println("已经在D档,不能换档");
    }
}
