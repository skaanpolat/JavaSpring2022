package Hw3.business;

import Hw3.dataAccess.IInstructorDao;
import Hw3.entities.Instructor;
import Hw3.logger.ILogger;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private ILogger[] loggers;
    private List<Instructor> existingInstructors = new ArrayList<>();

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        if(existingInstructors.isEmpty()){
            instructorDao.add(instructor);
            existingInstructors.add(instructor);
        }
        if (instructor.getFirstName().length() == 0) {
            throw new Exception("Eğitmen ismi boş kalamaz!");

        } else {

            for (Instructor eInstructors : existingInstructors) {

                if ((instructor.getFirstName().toLowerCase() + instructor.getLastName().toLowerCase())
                        .equals(eInstructors.getFirstName().toLowerCase() + eInstructors.getLastName().toLowerCase())) {
                    throw new Exception("Bu eğitmen zaten mevcut!");
                } else {
                    instructorDao.add(instructor);
                    for (ILogger logger : loggers) {
                        logger.log(instructor.getFirstName() + " " + instructor.getLastName());
                    }

                }
            }
        }

    }
}
