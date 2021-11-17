package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Car;

public interface CarRepository {
	void add(Car car);
	void delete(Car car);
	void update(Car car);
	List<Car> getAll();
	Car getById(int id);
	
}
