package factory.simpleFactory;

/**
 * @author hubin
 * @date 2023年01月01日 11:43
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
