package factory.abstractFactory;

import factory.abstractFactory.pojo.JavaNote;
import factory.abstractFactory.pojo.JavaVideo;

/**
 * @author hubin
 * @date 2023年01月01日 12:19
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {

        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        return new JavaVideo();
    }
}
