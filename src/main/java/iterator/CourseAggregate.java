package iterator;

/**
 * 课程集合接口
 * @author hubin
 * @date 2023年01月05日 13:55
 */
public interface CourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
