package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CarRepository;
import entities.concretes.Car;



public class CarDao implements CarRepository {
	
	List<Car> cars;
	
	public CarDao() {
		cars = new ArrayList<Car>();
	}
	
	@Override
	public void add(Car car) {
		cars.add(car);
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return cars;
	}

	@Override
	public Car getById(int id) {
		// TODO Auto-generated method stub
		for(Car item : cars) {
			if(item.getId() == id) 
				return item;
		}
		return null;
	}
	

}
