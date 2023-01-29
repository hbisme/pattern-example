package iterator;

/**
 * @author hubin
 * @date 2023年01月05日 14:05
 */
public class App {
    public static void main(String[] args) {
        Course java = new Course("java");
        Course python = new Course("python");
        Course ai = new Course("ai");

        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(java);
        courseAggregate.add(python);
        courseAggregate.add(ai);

        System.out.println("----课程列表-----");
        printCourses(courseAggregate);

        System.out.println("///////////");

        CourseAggregateImpl2 courseAggregate2 = new CourseAggregateImpl2();
        courseAggregate2.add(java);
        courseAggregate2.add(python);
        courseAggregate2.add(ai);
        System.out.println("----课程列表-----");
        printCourses(courseAggregate);


    }

    public static void printCourses(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("[" + course.getName() + "课程]");
        }
    }
}
