package factory.abstractFactory.pojo;

import factory.abstractFactory.IVideo;

/**
 * @author hubin
 * @date 2023年01月01日 12:16
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
