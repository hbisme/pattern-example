package decorator;

public class Hat extends ClothesDecorator {
    public Hat(Person person) {
        super(person);
    }


    @Override
    public Double cost() {
        // 帽子50元
        return person.cost() + 50;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("穿上了帽子,累积消费:" + this.cost());
    }
}
