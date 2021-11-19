package com.etiya.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.rentacar.entities.Color;

public interface ColorDao extends JpaRepository<Color, Integer>{

}
