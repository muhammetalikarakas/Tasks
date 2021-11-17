package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Category;

public interface ICategory {
	void add(Category category);
	List<Category> getAll();
}
