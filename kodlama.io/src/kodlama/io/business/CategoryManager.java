package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager{
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	 List<String> categoryNames = new ArrayList<String>();
	 
	 public void add(Category category) throws Exception {
		System.out.println("Kategori eklendi.");
		 for(String categoryName : categoryNames) {
			 if(categoryName==category.getName()) {
				 throw new Exception("Bu isimde bir kategori zaten mevcut.");
			 }
		
		}
	 	categoryNames.add(category.getName());
	 	categoryDao.add(category);
	 	for (Logger logger : loggers) {
            logger.log(category.getName());
        }
	}
	 }
	 

