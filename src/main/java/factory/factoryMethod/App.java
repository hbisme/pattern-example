package factory.factoryMethod;

/**
 *
 * 工厂方法模式的测试
 */
public class App {
    public static void main(String[] args) {
        ICourse java = new JavaCourseFactory().create();
        java.record();

        ICourse python = new PythonCourseFacotry().create();
        python.record();

    }
}
