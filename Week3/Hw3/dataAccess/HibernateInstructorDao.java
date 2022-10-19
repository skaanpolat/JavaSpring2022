package Hw3.dataAccess;

import Hw3.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) throws Exception {
        System.out.println( instructor.getFirstName()+ " " +instructor.getLastName().toUpperCase() + " Hibernate ile eklenmiştir.");
    }
}
