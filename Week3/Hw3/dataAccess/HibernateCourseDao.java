package Hw3.dataAccess;

import Hw3.entities.Course;

public class HibernateCourseDao implements ICourseDao{

    @Override
    public void add(Course course) throws Exception {

        System.out.println("\n=> " + course.getName() + " Hibernate ile eklenmiştir.");
    }
}
