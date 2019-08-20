package dependencyInversion.with;



public class client {
    public static void main(String[] args) {
        Staff staffA = new StaffImpl("A 员工");
        Staff staffB = new StaffImpl("B 员工");
        Boss bossA = new BossImpl(staffA);
        Boss bossB = new BossImpl(staffB);

        // A老板向B老板求援
        bossA.askHelp(bossB);

        // B老板向A老板求援
        bossB.askHelp(bossA);


    }
}
