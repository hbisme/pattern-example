package factory.factoryMethod;



/**
 * @author hubin
 * @date 2023年01月01日 11:54
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
