package com.etiya.rentacar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.etiya.rentacar.business.abstracts.ColorService;
import com.etiya.rentacar.business.dtos.ColorSearchListDto;
import com.etiya.rentacar.business.requests.CreateColorRequest;
import com.etiya.rentacar.business.requests.DeleteColorRequest;
import com.etiya.rentacar.business.requests.UpdateColorRequest;
import com.etiya.rentacar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.ColorDao;
import com.etiya.rentacar.entities.Color;

@Service
public class ColorManager implements ColorService{

	private ColorDao colorDao;
	private ModelMapperService modelMapperService;
	public ColorManager(ColorDao colorDao,ModelMapperService modelMapperService) {
		super();
		this.modelMapperService = modelMapperService;
		this.colorDao = colorDao;
	}

	@Override
	public List<ColorSearchListDto> getAll() {
		List<Color> result = this.colorDao.findAll();

		List<ColorSearchListDto> response = result.stream().map(color->modelMapperService.forDto()
				.map(color,ColorSearchListDto.class)).collect(Collectors.toList());
				
		
		return response;
	}

	@Override
	public void save(CreateColorRequest createColorRequest) {
		Color color = modelMapperService.forRequest().map(createColorRequest,Color.class);
		this.colorDao.save(color);
		
	}

	@Override
	public void update(UpdateColorRequest updateColorRequest) {
		Color color = modelMapperService.forRequest().map(updateColorRequest, Color.class);
		this.colorDao.save(color);
		
	}

	@Override
	public void delete(DeleteColorRequest deleteColorRequest) {
		Color color = modelMapperService.forRequest().map(deleteColorRequest, Color.class);
		this.colorDao.delete(color);
		
	}

}
