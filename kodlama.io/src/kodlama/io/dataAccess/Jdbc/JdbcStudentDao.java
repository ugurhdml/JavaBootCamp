package kodlama.io.dataAccess.Jdbc;

import kodlama.io.dataAccess.StudentDao;
import kodlama.io.entities.Student;

public class JdbcStudentDao implements StudentDao{

	@Override
	public void add(Student student) {
		System.out.println("Jdbc ile veritabanına eklendi.");
	}

}
