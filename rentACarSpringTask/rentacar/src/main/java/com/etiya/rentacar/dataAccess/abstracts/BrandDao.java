package com.etiya.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.rentacar.entities.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer>{

}
