package Hw3.business;

import Hw3.dataAccess.ICourseDao;
import Hw3.entities.Course;
import Hw3.logger.ILogger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private ICourseDao courseDao;
    private ILogger[] loggers;
    private List<Course> existingCourses = new ArrayList<>();

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }


    public void add(Course course) throws Exception {

        if (course.getName().isEmpty()) {
            throw new Exception("Ders adı boş olamaz!");
        }
        if (course.getPrice() < 0) {
            throw new Exception("Kurs ücreti '0'dan küçük olamaz!");
        }

        if (existingCourses.isEmpty()) {
            courseDao.add(course);
            existingCourses.add(course);
            for (ILogger logger : loggers) {
                logger.log(course.getName());
            }

        } else {

            for (Course ecourse : existingCourses) {

                if (ecourse.getName().equals(course.getName())) {
                    throw new Exception("Ders zaten kayıtlı!");
                }
                courseDao.add(course);
                existingCourses.add(course);

                for (ILogger logger : loggers) {
                    logger.log(course.getName());
                }
            }
        }

    }

}
