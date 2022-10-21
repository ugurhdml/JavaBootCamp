package kodlama.io.dataAccess.Hibernate;

import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao  {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
