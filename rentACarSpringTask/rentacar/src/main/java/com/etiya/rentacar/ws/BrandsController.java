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

import com.etiya.rentacar.business.abstracts.BrandService;
import com.etiya.rentacar.business.dtos.BrandSearchListDto;
import com.etiya.rentacar.business.requests.CreateBrandRequest;
import com.etiya.rentacar.business.requests.DeleteBrandRequest;
import com.etiya.rentacar.business.requests.UpdateBrandRequest;

@RestController //controllerin kullanılması için
@RequestMapping("api/brands") //yolunu belirten anastasyon
public class BrandsController {

	private BrandService brandservice;

	@Autowired
	public BrandsController(BrandService brandservice) {
		super();
		this.brandservice = brandservice;
	}
	@GetMapping("check")
	public String check() {
		return "API up";
	}

	@GetMapping("all")
	public List<BrandSearchListDto> getAll() {

		return this.brandservice.getAll();
	}
	
	@PostMapping("add")
	public void add(@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandservice.save(createBrandRequest);
	}
	
	@PutMapping("update")
	public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		this.brandservice.update(updateBrandRequest);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody DeleteBrandRequest deleteBrandRequest) {
		this.brandservice.delete(deleteBrandRequest);
	}
}
