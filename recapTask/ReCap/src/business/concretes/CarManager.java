package business.concretes;

import java.util.List;

import business.abstracts.CarService;
import core.utilites.result.SuccessDataResult;
import core.utilites.result.Result;
import core.utilites.result.SuccessResult;
import dataAccess.abstracts.CarRepository;
import entities.concretes.Car;

public class CarManager implements CarService{
	
	private CarRepository carRepository;
	
	public CarManager(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	@Override
	public Result add(Car car) {
		this.carRepository.add(car);
		return new SuccessResult("araba ekleme işleminzi gerçekleşti");
	}

	@Override
	public Result delete(Car car) {
		this.carRepository.delete(car);
		return new SuccessResult();

	}

	@Override
	public Result update(Car car) {
		this.carRepository.update(car);
		return new SuccessResult();
	}

	@Override

	public SuccessDataResult<List<Car>> getAll() {
        return new SuccessDataResult<List<Car>>(this.carRepository.getAll());
    }

	@Override
	public Car getById(int id) {
		// TODO Auto-generated method stub
		return this.carRepository.getById(id);
	}
	

}
