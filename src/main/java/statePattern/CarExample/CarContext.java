package statePattern.CarExample;

public class CarContext {
    //0：Park驻车档，1：Reverse倒退挡，
    //2：Neutral空挡，3：Drive前进档。

    //    R  <-> P <-> N <-> D

    //初始状态是P档
    CarState carState = new ParkState();

    void switchP(){
        carState.switchPark(this);
    }

    void switchR() {
        carState.switchReverse(this);
    }

    void switchN() {
        carState.switchNeutral(this);
    }

    void switchD() {
        carState.switchDrive(this);
    }


    public CarState getCarState() {
        return carState;
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
    }
}
