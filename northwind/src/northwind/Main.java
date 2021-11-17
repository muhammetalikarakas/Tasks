package northwind;

import northwind.business.abstracts.EmployeeService;
import northwind.business.abstracts.ICategory;
import northwind.business.abstracts.ProductService;
import northwind.business.concretes.CategoryManager;
import northwind.business.concretes.EmployeeManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.CategoryDao;
import northwind.dataAccess.concretes.EmployeeDao;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Category;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1, "Elma", 10, 1));
		productService.add(new Product(2, "şeftali", 10, 2));
		productService.add(new Product(3, "Elma", 10, 5));
		productService.add(new Product(3, "Kiraz", 8, 3));
		productService.add(new Product(1, "Ayva", -6, 1));
		productService.add(new Product(1, "Muz", 6, 1));
		productService.add(new Product(1, "Erik", 6, 1));
		productService.add(new Product(1, "Karpuz", 6, 1));
		productService.add(new Product(1, "Çilek", 6, 1));

		for (Product product: productService.getAll()) {
			System.out.println(product.getProductName());
		}		
		ICategory ýCategory = new CategoryManager(new CategoryDao());
		ýCategory.add(new Category(1, "Sebze"));
		
		for(Category category: ýCategory.getAll()) {
			System.out.println(category.getCategoryName());
		}
		
		EmployeeService employeeService = new EmployeeManager(new EmployeeDao());
		employeeService.add(new Employee(1, "Kübra", "Bayýndýr", "Ankara"));
		
		for (Employee employee : employeeService.getAll()) {
			System.out.println(employee.getFirstName());
			
		}
		
	}

}
