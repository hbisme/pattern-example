package openClosed;

public class Client {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        OneLevelSocialSecurityPatient onePerson = new OneLevelSocialSecurityPatient("小明");
        hospital.sellMedicine(onePerson, 2);

        TwoLevelSocialSecurityPatient twoPerson = new TwoLevelSocialSecurityPatient("小红");
        hospital.sellMedicine(twoPerson, 2);



    }

}
