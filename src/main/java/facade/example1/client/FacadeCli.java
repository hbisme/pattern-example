package facade.example1.client;

import facade.example1.Facade;
import facade.example1.SubSystemA_Light;
import facade.example1.SubSystemB_Television;
import facade.example1.SubSystemC_Aircondition;

public class FacadeCli {
    public static void main(String[] args) {
        //实例化电器类
        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();


        Facade facade = new Facade(light, television, aircondition);

        facade.on();
        System.out.println("可以看电视了");
        facade.off();
        System.out.println("可以睡觉了");

    }
}
