package com.etiya.rentacar.business.abstracts;

import java.util.List;

import com.etiya.rentacar.business.dtos.ColorSearchListDto;
import com.etiya.rentacar.business.requests.CreateColorRequest;
import com.etiya.rentacar.business.requests.DeleteColorRequest;
import com.etiya.rentacar.business.requests.UpdateColorRequest;

public interface ColorService {

	List<ColorSearchListDto> getAll();
	void save(CreateColorRequest createColorRequest);
	void update(UpdateColorRequest updateColorRequest);
	void delete(DeleteColorRequest deleteColorRequest);
}
