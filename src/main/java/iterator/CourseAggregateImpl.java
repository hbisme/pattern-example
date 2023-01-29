package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程集合
 *
 * @author hubin
 * @date 2023年01月05日 14:00
 */
public class CourseAggregateImpl implements CourseAggregate {
    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        this.courseList.add(course);

    }

    @Override
    public void remove(Course course) {
        this.courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(this.courseList);
    }
}
