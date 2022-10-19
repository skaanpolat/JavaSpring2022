package Hw3;

import Hw3.business.CategoryManager;
import Hw3.business.CourseManager;
import Hw3.business.InstructorManager;
import Hw3.dataAccess.*;
import Hw3.entities.Category;
import Hw3.entities.Course;
import Hw3.entities.Instructor;
import Hw3.logger.DatabaseLogger;
import Hw3.logger.FileLogger;
import Hw3.logger.ILogger;
import Hw3.logger.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {

        ILogger[] loggers = new ILogger[]{ new FileLogger(),new DatabaseLogger(),new MailLogger()};

        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"İleri Seviye Programlama");
        Category category3 = new Category(3,"Kariyer");

        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
        CategoryManager categoryManager2=new CategoryManager(new HibernateCategoryDao(),loggers);

        categoryManager.add(category1);
        categoryManager2.add(category2);
        categoryManager.add(category3);


        Course course1 = new Course(5,"Java5",100);
        Course course2 = new Course();

        course2.setName("Rust");
        course2.setPrice(101);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        courseManager2.add(course2);




        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");
        Instructor instructor2 = new Instructor(2,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

    }
}
