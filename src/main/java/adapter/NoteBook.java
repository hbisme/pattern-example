package adapter;

/*
* 笔记本电脑类
*  期望三项插座供电
* */
public class NoteBook {
    private ThreePlug plug;

    public NoteBook(ThreePlug plug) {
        this.plug = plug;
    }

    // 使用插座充电
    public void charge() {
        plug.powerWithTreePlug();
    }


    public static void main(String[] args) {

        // 两相的电源底座
        GBTwoPlug gbTwoPlug = new GBTwoPlug();

        // 三相插头转两相插头适配器
        ThreePlug threePlug = new TwoPlugAdapterToThree(gbTwoPlug);
        NoteBook noteBook = new NoteBook(threePlug);
        noteBook.charge();
    }


}
