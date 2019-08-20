package dependencyInversion.without;

public class StaffA extends Staff {

    public StaffA(String name) {
        this.setName(name);
    }

    @Override
    void service() {
        System.out.println(this.getName() + "提供服务");
    }

    @Override
    void askHelp(Boss boss) {
        boss.support();
    }
}
