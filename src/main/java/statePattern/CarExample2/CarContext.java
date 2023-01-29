package statePattern.CarExample2;

/**
 *
 *     //0：Park驻车档，1：Reverse倒退挡，
 *     //2：Neutral空挡，3：Drive前进档。
 *
 *     //    R  <-> P <-> N <-> D
 *
 *     //初始状态是P档
 */
public class CarContext {
    public static final CarState PARK_STATUS = new ParkState();
    public static final CarState NEURAL_STATUS = new NeutralState();
    public static final CarState REVER_STATUS = new ReverseState();
    public static final CarState DRIVE_STATUS = new DriveState();

    private CarState currentState = PARK_STATUS;

    {
        PARK_STATUS.setContent(this);
        NEURAL_STATUS.setContent(this);
        REVER_STATUS.setContent(this);
        DRIVE_STATUS.setContent(this);
        // this.currentState.setContent(this);
    }

    public void setState(CarState carState) {
        this.currentState = carState;
        this.currentState.setContent(this);
    }

    public CarState getState() {
        return this.currentState;
    }


    public void switchPark() {
        this.currentState.switchPark();
    }

    public void switchReverse() {
        this.currentState.switchReverse();
    }

    public void switchNeutral() {
        this.currentState.switchNeutral();
    }

    public void switchDrive() {
        this.currentState.switchDrive();
    }


}
