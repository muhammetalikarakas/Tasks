package business.concretes;

import java.util.List;

import business.abstracts.BrandService;
import core.utilites.result.Result;
import core.utilites.result.SuccessDataResult;
import core.utilites.result.SuccessResult;
import dataAccess.abstracts.BrandRepository;
import entities.concretes.Brand;
import entities.concretes.Car;

public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}
	@Override
	public Result add(Brand brand) {
		this.brandRepository.add(brand);
		return new SuccessResult();
	}

	@Override
	public Result delete(Brand brand) {
		this.brandRepository.delete(brand);
		return new SuccessResult();
	}

	@Override
	public Result update(Brand brand) {
		this.brandRepository.update(brand);
		return new SuccessResult();
	}

	@Override
	public SuccessDataResult<List<Brand>> getAll() {
        return new SuccessDataResult<List<Brand>>(this.brandRepository.getAll());
    }

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return this.brandRepository.getById(id);
	}

}
