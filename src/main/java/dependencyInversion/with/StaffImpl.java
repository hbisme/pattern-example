package dependencyInversion.with;



public class StaffImpl extends Staff {

    public StaffImpl(String name) {
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
