package factory.factoryMethod;

/**
 * @author hubin
 * @date 2023年01月01日 11:56
 */
public class PythonCourseFacotry implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
