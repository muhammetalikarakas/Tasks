package com.etiya.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.rentacar.entities.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
}
