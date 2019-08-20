package dependencyInversion.with;

public class BossImpl extends Boss{

    public BossImpl(Staff staff) {
        super(staff);
    }

    @Override
    void support() {
        this.getStaff().service();

    }

    @Override
    void askHelp(Boss boss) {
        boss.support();
    }
}
