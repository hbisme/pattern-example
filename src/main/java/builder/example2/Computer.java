package builder.example2;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<String> parts = new ArrayList<String>();


    void add(String part) {
        parts.add(part);
    }

    public void show(){
        parts.stream().forEach(part -> System.out.println(part + ", 装好了"));
        System.out.println("电脑组装完成.");
    }
}
