package dependencyInversion.without;

abstract public class Staff {
    private String name;

    abstract void service();

    abstract void askHelp(Boss boss);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
