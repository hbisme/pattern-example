package bridge;

public class IOSPhone extends Phone {

    public IOSPhone(Software software) {
        this.setSystem("IOS");
        this.setSoftware(software);
    }

    @Override
    public void openSoftware() {
        this.getSoftware().open(this);
    }
}
