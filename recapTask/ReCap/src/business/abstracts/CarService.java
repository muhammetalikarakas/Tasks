package business.abstracts;

import java.util.List;

import core.utilites.result.DataResult;
import core.utilites.result.Result;
import entities.concretes.Car;

public interface CarService {
	Result add(Car car);
	Result delete(Car car);
	Result update(Car car);
	DataResult<List<Car>> getAll();
	Car getById(int id);
}
