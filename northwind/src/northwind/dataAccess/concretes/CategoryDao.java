package northwind.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccess.abctracts.CategoryService;
import northwind.entities.concretes.Category;

public class CategoryDao implements CategoryService{

		List<Category> categories;
		
		public CategoryDao() {
			categories = new ArrayList<Category>();
		}
	@Override
	public void add(Category category) {
		this.categories.add(category);		
	}

	@Override
	public List<Category> getAll() {
		return this.categories;
	}
	@Override
	public void delete(Category t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Category t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
