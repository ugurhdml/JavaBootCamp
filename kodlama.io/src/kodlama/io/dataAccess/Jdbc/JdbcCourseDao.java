package kodlama.io.dataAccess.Jdbc;

import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class JdbcCourseDao  implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi.");
	}

}
