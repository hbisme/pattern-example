package bridge;

public class AndroidPhone extends Phone{

    public AndroidPhone(Software software) {
        this.setSystem("Android");
        this.setSoftware(software);
    }



    @Override
    public void openSoftware() {
        this.getSoftware().open(this);
    }
}
