package dependencyInversion.without;

public class BossA extends Boss {
    private StaffA staffA;

    public BossA(StaffA staffA) {
        this.staffA = staffA;
    }

    @Override
    void support() {
        staffA.service();
    }

    @Override
    void askHelp(Boss boss) {
        boss.support();
    }
}
