package statePattern.CarExample2;

public abstract class CarState {
    protected CarContext content;

    public CarContext getContent() {
        return content;
    }

    public void setContent(CarContext content) {
        this.content = content;
    }

    public abstract void  switchPark();
    public abstract void switchReverse();
    public abstract void switchNeutral();
    public abstract void switchDrive();

    public abstract String getStateName();


}
