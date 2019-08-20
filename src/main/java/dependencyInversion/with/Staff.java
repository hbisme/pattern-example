package dependencyInversion.with;



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
