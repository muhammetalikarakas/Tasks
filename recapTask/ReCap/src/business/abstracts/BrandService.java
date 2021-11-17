package business.abstracts;

import java.util.List;

import core.utilites.result.DataResult;
import core.utilites.result.Result;
import entities.concretes.Brand;

public interface BrandService {
	Result add(Brand brand);
	Result delete(Brand brand);
	Result update(Brand brand);
	DataResult<List<Brand>> getAll();
	Brand getById(int id);
}
