package decorator;

public class Main {
    public static void main(String[] args) {
        Person laowang = new Laowang();

        laowang = new Jacket(laowang);
        laowang.show();

        System.out.println("------");
        laowang = new Hat(laowang);
        laowang.show();

        System.out.println("买单,老王一共消费: " + laowang.cost());



    }
}
