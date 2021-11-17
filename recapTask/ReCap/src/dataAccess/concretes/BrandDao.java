package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BrandRepository;
import entities.concretes.Brand;

public class BrandDao implements BrandRepository {
	
	List<Brand> brands;
	
	public BrandDao() {
		brands = new ArrayList<Brand>();
		
	}
	
	@Override
	public void add(Brand brand) {
		brands.add(brand);
		
	}

	@Override
	public void delete(Brand brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

	@Override
	public Brand getById(int id) {
		for(Brand item : brands) {
			if(item.getBrandId() == id) 
				return item;
		}
		return null;
	}

}
