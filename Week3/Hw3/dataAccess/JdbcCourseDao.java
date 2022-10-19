package Hw3.dataAccess;

import Hw3.business.CourseManager;
import Hw3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

        CourseManager courseManager;

    @Override
    public void add(Course course) throws Exception {

        System.out.println("\n=> " +course.getName() + " JDBC ile eklenmiştir.");
    }
}
