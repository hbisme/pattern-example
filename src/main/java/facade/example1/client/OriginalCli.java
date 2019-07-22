package facade.example1.client;

import facade.example1.SubSystemA_Light;
import facade.example1.SubSystemB_Television;
import facade.example1.SubSystemC_Aircondition;

// 不使用 外观模式的情况
// 与三个子系统都发生了耦合,使得客户端程序依赖于子系统
public class OriginalCli {
    public static void main(String[] args) {


        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();


        // 起床后打开电器
        System.out.println("起床了");
        light.on();
        television.on();
        aircondition.on();
        System.out.println("可以看电视了");


        // 睡觉前关电器
        System.out.println("睡觉了");
        light.off();
        television.off();
        aircondition.off();
        System.out.println("可以睡觉了");

    }
}
