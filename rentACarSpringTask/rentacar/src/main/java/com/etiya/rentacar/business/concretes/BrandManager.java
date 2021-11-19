package com.etiya.rentacar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.etiya.rentacar.business.abstracts.BrandService;
import com.etiya.rentacar.business.dtos.BrandSearchListDto;
import com.etiya.rentacar.business.requests.CreateBrandRequest;
import com.etiya.rentacar.business.requests.DeleteBrandRequest;
import com.etiya.rentacar.business.requests.UpdateBrandRequest;
import com.etiya.rentacar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.BrandDao;
import com.etiya.rentacar.entities.Brand;

@Service
public class BrandManager implements BrandService{
	
	private BrandDao brandDao;
	private ModelMapperService modelMapperService;

	public BrandManager(BrandDao brandDao,ModelMapperService modelMapperService) {
		super();
		this.modelMapperService = modelMapperService;
		this.brandDao = brandDao;
	}

	@Override
	public List<BrandSearchListDto> getAll() {
		
		List<Brand> result = this.brandDao.findAll();
		List<BrandSearchListDto> response = result.stream().map(brand->modelMapperService.forDto()
				.map(brand,BrandSearchListDto.class)).collect(Collectors.toList());
		
		return response;
	}

	@Override
	public void save(CreateBrandRequest createBrandRequest) {
		Brand brand = modelMapperService.forRequest().map(createBrandRequest,Brand.class);
		this.brandDao.save(brand);
		
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
		this.brandDao.save(brand);
		
	}

	@Override
	public void delete(DeleteBrandRequest deleteBrandRequest) {
		Brand brand = modelMapperService.forRequest().map(deleteBrandRequest,Brand.class);
		this.brandDao.delete(brand);
		
	}
	

}
