package statePattern.CarExample;

public interface CarState {
    void switchPark(Car car);
    void switchReverse(Car car);
    void switchNeutral(Car car);
    void switchDrive(Car car);



}
