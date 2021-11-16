package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ICategory;
import northwind.dataAccess.abctracts.CategoryService;
import northwind.entities.concretes.Category;

public class CategoryManager implements ICategory {

	private CategoryService categoryService;
	
	
	public CategoryManager(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	@Override
	public void add(Category category) {
		this.categoryService.add(category);
	}

	@Override
	public List<Category> getAll() {
		return this.categoryService.getAll();	
	}

}
