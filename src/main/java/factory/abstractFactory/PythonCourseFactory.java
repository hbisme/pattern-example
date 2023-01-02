package factory.abstractFactory;

import factory.abstractFactory.pojo.PythonNote;
import factory.abstractFactory.pojo.PythonVideo;

/**
 * @author hubin
 * @date 2023年01月01日 12:20
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        return new PythonNote();

    }

    @Override
    protected IVideo createVideo() {
        return new PythonVideo();
    }
}
