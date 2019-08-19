package flyweight;

import flyweight.ICrayon;

public class Crayon implements ICrayon {

    private String color;

    public Crayon(String color) {
        System.out.println("---新建【" + color + "】蜡笔");
        this.color = color;
    }

    @Override
    public void draw(String place) {
        System.out.println("用 " + this.color + " 蜡笔画 " + place);


    }
}
