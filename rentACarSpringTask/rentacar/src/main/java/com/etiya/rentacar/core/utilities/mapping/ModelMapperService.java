package com.etiya.rentacar.core.utilities.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forDto();
	ModelMapper forRequest();
}

//genelllikle 2 amaç için yapılır bir dto bide requestler için
