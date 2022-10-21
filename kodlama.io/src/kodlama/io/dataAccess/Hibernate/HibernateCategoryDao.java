package kodlama.io.dataAccess.Hibernate;

import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
