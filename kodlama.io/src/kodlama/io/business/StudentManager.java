package kodlama.io.business;

import kodlama.io.dataAccess.StudentDao;
import kodlama.io.entities.Student;
import kodlama.io.core.logging.*;
public class StudentManager {
	private StudentDao studentDao;
	private Logger[] loggers;
	
	public StudentManager(StudentDao studentDao, Logger[] loggers) {
		this.studentDao = studentDao;
		this.loggers=loggers;
	}
	public void add(Student student) {
		System.out.println("Öğrenci eklendi.");
		studentDao.add(student);
		
		for (Logger logger : loggers) {
            logger.log(student.getName());
        }
	
	}

}
