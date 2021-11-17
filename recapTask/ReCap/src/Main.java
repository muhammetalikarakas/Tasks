import business.abstracts.BrandService;
import business.abstracts.CarService;
import business.abstracts.ColorService;
import business.concretes.BrandManager;
import business.concretes.CarManager;
import business.concretes.ColorManager;
import dataAccess.concretes.BrandDao;
import dataAccess.concretes.CarDao;
import dataAccess.concretes.ColorDao;
import entities.concretes.Brand;
import entities.concretes.Car;
import entities.concretes.Color;


public class Main {

	public static void main(String[] args) {
		CarService carService = new CarManager(new CarDao());
		carService.add(new Car(1,2020, 1000.00,"Mercedes"));
		
		BrandService brandService=new BrandManager(new BrandDao());
		brandService.add(new Brand(5,"tofaş"));
		
		ColorService colorService=new ColorManager(new ColorDao());
		colorService.add(new Color(6,"fosfor yeşili")); 
		
		for(Color color: colorService.getAll().getData()) {
			System.out.println(color.getColorName());
		}
		
		for(Brand brand: brandService.getAll().getData()) {
			System.out.println(brand.getBrandName());
		}
		
		for(Car car: carService.getAll().getData()) {
			System.out.println(car.getDescription());
		}
	}

}
