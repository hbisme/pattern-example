package decorator;

public class Jacket extends ClothesDecorator {

    public Jacket(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        //夹克100元
        return person.cost() + 100;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("穿上了夹克,累积消费: " + this.cost());
    }
}
