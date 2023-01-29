package statePattern.CarExample;

public interface CarState {
    void switchPark(CarContext carContext);
    void switchReverse(CarContext carContext);
    void switchNeutral(CarContext carContext);
    void switchDrive(CarContext carContext);

    String getStateName();


}
