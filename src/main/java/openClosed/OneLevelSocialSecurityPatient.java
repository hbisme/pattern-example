package openClosed;

/**
 * 一档病人
 */
public class OneLevelSocialSecurityPatient implements IPerson {

    private String name;

    public OneLevelSocialSecurityPatient(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "一档病人";
    }


    @Override
    public Double getRate() {
        return 0.6;
    }
}
