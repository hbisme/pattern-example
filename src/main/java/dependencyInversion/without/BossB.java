package dependencyInversion.without;

public class BossB extends Boss {
    private StaffB staffB;

    public BossB(StaffB staffB) {
        this.staffB = staffB;
    }

    @Override
    void support() {
        staffB.service();
    }

    @Override
    void askHelp(Boss boss) {
        boss.support();
    }
}