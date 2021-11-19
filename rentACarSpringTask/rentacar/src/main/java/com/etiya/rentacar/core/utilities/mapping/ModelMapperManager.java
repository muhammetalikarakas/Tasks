package com.etiya.rentacar.core.utilities.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements ModelMapperService {
	
	private ModelMapper modelMapper; //mm servisi istendiğinde dto için mi request için mi dersin
	//dto mapping ise aşağıdaki requert olsa yine aşağıdaki configürasyon kodunu yazarson
	
	@Autowired
	public ModelMapperManager(ModelMapper modelMapper) {//injection
		super();
		this.modelMapper = modelMapper;
	}

	@Override
	public ModelMapper forDto() {
		this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE); //loose gevşek demek yani tüm alanları map etmek zorunda değilsin neyi istiyorsan onu et sonuçta dto 
		return modelMapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); //loose gevşek demek yani tüm alanları map etmek zorunda değilsin neyi istiyorsan onu et sonuçta dto 
		return modelMapper;
	}

}
