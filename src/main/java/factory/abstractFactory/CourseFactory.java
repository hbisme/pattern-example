package factory.abstractFactory;

/**
 *
 * 抽象工厂
 */
public abstract class CourseFactory {
    public void init() {
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}


