package factory.simpleFactory;

/**
 * @author hubin
 * @date 2023年01月01日 11:42
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
