package factory.simpleFactory;

/**
 * @author hubin
 * @date 2023年01月01日 11:44
 */
public class CourseFactory {
    public static ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        ICourse course = CourseFactory.create("java");
        course.record();

    }
}
