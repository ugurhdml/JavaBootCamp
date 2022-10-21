package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.business.StudentManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.dataAccess.StudentDao;
import kodlama.io.dataAccess.Hibernate.HibernateCategoryDao;
import kodlama.io.dataAccess.Hibernate.HibernateCourseDao;
import kodlama.io.dataAccess.Hibernate.HibernateInstructorDao;
import kodlama.io.dataAccess.Hibernate.HibernateStudentDao;
import kodlama.io.dataAccess.Jdbc.JdbcCategoryDao;
import kodlama.io.dataAccess.Jdbc.JdbcCourseDao;
import kodlama.io.dataAccess.Jdbc.JdbcInstructorDao;
import kodlama.io.dataAccess.Jdbc.JdbcStudentDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;
import kodlama.io.entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		Student student1 = new Student();
		student1.setId(999);
		student1.setName("Uğur");
		StudentManager studentManager1 = new StudentManager(new HibernateStudentDao(),loggers);
		studentManager1.add(student1);

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin Demiorğ");

		InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager1.add(instructor1);

		Category category1 = new Category();
		category1.setId(10);
		category1.setName("Programlama");
		CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager1.add(category1);

		Course course1 = new Course();
		course1.setCategory("Programlama");
		course1.setId(50);
		course1.setName("Java yazılım geliştirme kampı.");
		course1.setInfo("Temel/Giriş seviyesinde java eğitimi.");
		course1.setInstructor("Engin Demiroğ");
		course1.setPrice(500);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);

		courseManager.Add(course1);
	}

}
