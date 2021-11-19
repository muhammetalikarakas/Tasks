package com.etiya.rentacar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.dtos.CarSearchListDto;
import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.DeleteCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;
import com.etiya.rentacar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.CarDao;
import com.etiya.rentacar.entities.Car;

@Service
public class CarManager implements CarService{

	private CarDao carDao;
	private ModelMapperService modelMapperService;
	
	@Autowired
	public CarManager(CarDao carDao, ModelMapperService modelMapperService) {
		super();
		this.carDao = carDao;
		this.modelMapperService = modelMapperService;
	}

//	@Override
//	public List<Car> getAll() {	
//		
//		return this.carDao.findAll();
////	List<Car> cars = new ArrayList<Car>();
////	cars.add(new Car(1,2020, 1000.00,"Mercedes"));
////	return cars;
//	}

	@Override
	public List<CarSearchListDto> getAll() {
		
		List<Car> result = this.carDao.findAll();
		List<CarSearchListDto> response = result.stream().map(car->modelMapperService.forDto()
				.map(car,CarSearchListDto.class)).collect(Collectors.toList());
		return response;
		
	}
	public void save(CreateCarRequest createCarRequest) {
		Car car = modelMapperService.forRequest().map(createCarRequest,Car.class);
		this.carDao.save(car);
		
	}

	@Override
	public void delete(DeleteCarRequest deleteCarRequest) {
		Car car = modelMapperService.forRequest().map(deleteCarRequest,Car.class);
		this.carDao.delete(car);
		
	}

	@Override
	public void update(UpdateCarRequest updateCarRequest) {
		Car car = modelMapperService.forRequest().map(updateCarRequest,Car.class);
		this.carDao.save(car);
		
	}

}
