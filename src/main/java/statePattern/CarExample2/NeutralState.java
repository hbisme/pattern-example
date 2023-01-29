package statePattern.CarExample2;

//    R  <-> P <-> N <-> D
public class NeutralState extends CarState {

    private final String stateName = "N档" ;

    @Override
    public void switchPark() {
        System.out.println("从N档换到P档");
        this.content.setState(this.content.PARK_STATUS);
    }

    @Override
    public void switchReverse()
    {
        switchPark();
        System.out.println("从P档换到R档");
        this.content.setState(this.content.REVER_STATUS);

    }

    @Override
    public void switchNeutral() {
        System.out.println("已经是N档,不能换挡");
    }

    @Override
    public void switchDrive() {
        System.out.println("从N档换到D档");

        this.content.setState(this.content.DRIVE_STATUS);
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
