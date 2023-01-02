package factory.abstractFactory;

/**
 * 抽象工厂模式测试
 *
 */
public class App {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();

        /////
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();

    }
}
