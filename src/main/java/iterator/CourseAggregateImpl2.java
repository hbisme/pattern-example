package iterator;

import java.util.HashSet;
import java.util.Set;

/**
 * 课程集合
 *
 * @author hubin
 * @date 2023年01月05日 14:00
 */
public class CourseAggregateImpl2 implements CourseAggregate {
    private Set<Course> courseSet;

    public CourseAggregateImpl2() {
        this.courseSet = new HashSet<>();
    }

    @Override
    public void add(Course course) {
        this.courseSet.add(course);

    }

    @Override
    public void remove(Course course) {
        this.courseSet.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(this.courseSet);
    }
}
