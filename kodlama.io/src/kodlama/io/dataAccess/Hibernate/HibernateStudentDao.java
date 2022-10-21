package kodlama.io.dataAccess.Hibernate;

import kodlama.io.dataAccess.StudentDao;
import kodlama.io.entities.Student;

public class HibernateStudentDao implements StudentDao {

	@Override
	public void add(Student student) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
