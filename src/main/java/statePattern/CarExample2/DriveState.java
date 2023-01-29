package statePattern.CarExample2;

//    R  <-> P <-> N <-> D
public class DriveState extends CarState {

    private final String stateName = "D档";

    @Override
    public void switchPark() {
        switchNeutral();
        System.out.println("从N档换到P档");
        this.content.setState(this.content.PARK_STATUS);
    }

    @Override
    public void switchReverse() {
        switchPark();
        System.out.println("从P档换到R档");
        this.content.setState(this.content.REVER_STATUS);
    }

    @Override
    public void switchNeutral() {
        System.out.println("从D档换到N档");
        this.content.setState(this.content.NEURAL_STATUS);
    }

    @Override
    public void switchDrive() {
        System.out.println("已经在D档,不能换档");
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
