package northwind.business.concretes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.dataAccess.abctracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {
		return this.productRepository.getAll();
	}

	public void add(Product product) {
		boolean check = true;
		int counter=1;
		
		for (Product p : productRepository.getAll()) {
			if (product.getProductName() == p.getProductName()) {
				System.out.println("hatalı : " + p.getProductName());
				check = false;
			}
		}
		for (Product item : getAll()) {
			if (item.getCategoryId()==product.getCategoryId()) { 
				counter++;
			}
			if (counter>=5) {
				System.out.println("hatalı : " + product.getProductName());
				check=false;
			}
		}


	
		if (product.getUnitPrice()<=0)
		{
			System.out.println("negatif değer ");
			check=false;
		}
		if (product.getCategoryId()==3 && product.getUnitPrice()<=10) {
			check=false;
		}
	if (check == true ) {
			this.productRepository.add(product);
		}

	}

}
