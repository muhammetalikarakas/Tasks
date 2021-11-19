package com.etiya.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {//id otomatik oluşuyor
	
	private int modelYear;

	private double dailyPrice;
	
	private String description;
}
