package com.etiya.rentacar.business.abstracts;

import java.util.List;

import com.etiya.rentacar.business.dtos.CarSearchListDto;
import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.DeleteCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;


public interface CarService {

	List<CarSearchListDto> getAll();
	void save(CreateCarRequest createCarRequest);
	void delete(DeleteCarRequest deleteCarRequest);
	void update(UpdateCarRequest updateCarRequest);
}
