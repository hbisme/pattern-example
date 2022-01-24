package command.example2;

public class Developer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void develop(Requirement requirement) {
        System.out.println(this.name + " 开始开发需求:" + requirement.getName());
    }

    public void suspend(Requirement requirement) {
        System.out.println(this.name + " 停止开发需求:" + requirement.getName());
    }
}
