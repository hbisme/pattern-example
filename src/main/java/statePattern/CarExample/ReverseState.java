package statePattern.CarExample;

//    R  <-> P <-> N <-> D
public class ReverseState implements CarState{
    @Override
    public void switchPark(Car car) {
        System.out.println("从R档换到P档位");
        car.setCarState(new ParkState());
    }

    @Override
    public void switchReverse(Car car) {
        System.out.println("已经在R档,不能换挡");
    }

    @Override
    public void switchNeutral(Car car) {
        switchPark(car);
        car.switchN();

    }

    @Override
    public void switchDrive(Car car) {
        switchNeutral(car);
        car.switchD();
    }
}
