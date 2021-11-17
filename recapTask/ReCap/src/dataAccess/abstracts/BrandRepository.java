package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Brand;

public interface BrandRepository {
	void add(Brand brand);
	void delete(Brand brand);
	void update(Brand brand);
	List<Brand> getAll();
	Brand getById(int id);
}
