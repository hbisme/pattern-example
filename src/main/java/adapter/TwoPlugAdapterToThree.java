package adapter;

/*
* 二相转三相的插座适配器
* 1. 实现目标适配器接口 ThreePlug (三项插口)
* 2. 组合适配者类 GBTwoPlug(两项插口)
* 3.
* */
public class TwoPlugAdapterToThree implements ThreePlug {
    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdapterToThree(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    // 实现期望转换后要实现的接口
    @Override
    public void powerWithTreePlug() {
        gbTwoPlug.powerWithTwo();
        System.out.println("通过转换二相供电到三相供电...");

    }
}
