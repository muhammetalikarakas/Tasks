package com.etiya.rentacar.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.dtos.CarSearchListDto;
import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.DeleteCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;

@RestController //controllerin kullanılması için
@RequestMapping("api/cars") //yolunu belirten anastasyon
public class CarsController {
	
	private CarService carService;
	
	@Autowired
	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}
	@GetMapping("check") //methodun erişilmesi için grekn anastasyon	
	public String check() { //methodumuz
		return "API up";
		}
	@GetMapping("getAll") //ekleme işlemi
	public List<CarSearchListDto> getAll(){	
		return this.carService.getAll();
	}
	
	@PostMapping("add") //postcişlemlerinde data bodyden alınır.
	public void add(@RequestBody CreateCarRequest createProductRequest){	
		this.carService.save(createProductRequest);
	}
	
	@PutMapping("update")
	public void update(@RequestBody UpdateCarRequest updateCarRequest) {//request body paket içeriisindeki ekleme görevlerini match edip dataya ekliyor.
		this.carService.update(updateCarRequest);
	}
	@DeleteMapping("delete")
	public void delete(@RequestBody DeleteCarRequest deleteCarRequest) {
		this.carService.delete(deleteCarRequest);
	}

	
	

}
