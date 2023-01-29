package statePattern.CarExample2;

//    R  <-> P <-> N <-> D
public class ParkState extends CarState {



    private final String stateName = "P档";


    @Override
    public void switchPark() {
        System.out.println("已经在P档了, 不能换挡");

    }

    @Override
    public void switchReverse() {
        System.out.println("从P换到R档");
        this.content.setState(this.content.REVER_STATUS);
    }

    @Override
    public void switchNeutral() {
        System.out.println("从P换到N档");
        this.content.setState(this.content.NEURAL_STATUS);
    }

    @Override
    public void switchDrive() {
        // P档到D档需要经过N档
        switchNeutral();
        System.out.println("从N换到D档");
        this.content.setState(this.content.DRIVE_STATUS);
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
