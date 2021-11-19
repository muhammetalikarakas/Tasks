package com.etiya.rentacar.ws;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.rentacar.business.abstracts.ColorService;
import com.etiya.rentacar.business.dtos.ColorSearchListDto;
import com.etiya.rentacar.business.requests.CreateColorRequest;
import com.etiya.rentacar.business.requests.DeleteColorRequest;
import com.etiya.rentacar.business.requests.UpdateColorRequest;

@RestController
@RequestMapping("api/colors")
public class ColorsController {

	private ColorService colorService;

	public ColorsController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}

	@GetMapping("check")
	public String check() {
		return "API up";
	}
	
	@GetMapping("all")
	public List<ColorSearchListDto> getAll(){
				
		return this.colorService.getAll();
	}
	
	@PostMapping("add")
	public void add(@RequestBody CreateColorRequest createColorRequest) {
		this.colorService.save(createColorRequest);
	}
	
	@PutMapping("update")
	public void update(@RequestBody UpdateColorRequest updateColorRequest) {
		this.colorService.update(updateColorRequest);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody DeleteColorRequest deleteColorRequest) {
		this.colorService.delete(deleteColorRequest);
	}
	
}