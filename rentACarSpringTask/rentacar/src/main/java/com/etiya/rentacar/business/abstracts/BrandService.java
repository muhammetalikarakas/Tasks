package com.etiya.rentacar.business.abstracts;

import java.util.List;

import com.etiya.rentacar.business.dtos.BrandSearchListDto;
import com.etiya.rentacar.business.requests.CreateBrandRequest;
import com.etiya.rentacar.business.requests.DeleteBrandRequest;
import com.etiya.rentacar.business.requests.UpdateBrandRequest;

public interface BrandService {

	List<BrandSearchListDto> getAll();
	void save(CreateBrandRequest createBrandRequest);
	void delete(DeleteBrandRequest deleteBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
}
