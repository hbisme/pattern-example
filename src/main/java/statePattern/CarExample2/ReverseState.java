package statePattern.CarExample2;

//    R  <-> P <-> N <-> D
public class ReverseState extends CarState {

    private final String stateName = "R档";

    @Override
    public void switchPark() {
        System.out.println("从R档换到P档位");
        this.content.setState(this.content.PARK_STATUS);
    }

    @Override
    public void switchReverse() {
        System.out.println("已经在R档,不能换挡");
    }

    @Override
    public void switchNeutral() {
        switchPark();
        System.out.println("从P档换到N档位");
        this.content.setState(this.content.NEURAL_STATUS);

    }

    @Override
    public void switchDrive() {
        switchNeutral();
        System.out.println("从N换到D档");
        this.content.setState(this.content.DRIVE_STATUS);
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
