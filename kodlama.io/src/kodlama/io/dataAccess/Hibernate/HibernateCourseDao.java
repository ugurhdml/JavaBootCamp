package kodlama.io.dataAccess.Hibernate;

import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
