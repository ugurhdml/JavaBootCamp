package kodlama.io.dataAccess.Jdbc;

import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi.");
	}

}
