package openClosed;

public class TwoLevelSocialSecurityPatient implements IPerson {
    private String name;

    public TwoLevelSocialSecurityPatient(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "二档病人";
    }

    @Override
    public Double getRate() {
        return 0.8;
    }
}
