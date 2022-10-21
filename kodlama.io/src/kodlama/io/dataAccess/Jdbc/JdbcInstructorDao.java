package kodlama.io.dataAccess.Jdbc;

import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi.");
	}

}
