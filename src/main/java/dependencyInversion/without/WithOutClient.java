package dependencyInversion.without;

public class WithOutClient {
    public static void main(String[] args) {
        StaffA staffA = new StaffA("A 员工");
        StaffB staffB = new StaffB("B 员工");
        Boss bossA = new BossA(staffA);
        Boss bossB = new BossB(staffB);

        // A老板向B老板求援
        bossA.askHelp(bossB);

        // B老板向A老板求援
        bossB.askHelp(bossA);


    }
}
