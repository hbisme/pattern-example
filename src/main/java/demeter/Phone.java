package demeter;

public class Phone {

    ReadBookApp phoneApp = new ReadBookApp();

    public ReadBookApp getPhoneApp() {
        return phoneApp;
    }

    public void setPhoneApp(ReadBookApp phoneApp) {
        this.phoneApp = phoneApp;
    }

    public void readBook() {
        phoneApp.read();
    }
}
