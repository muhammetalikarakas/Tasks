package business.concretes;

import java.util.List;

import business.abstracts.ColorService;
import core.utilites.result.Result;
import core.utilites.result.SuccessDataResult;
import core.utilites.result.SuccessResult;
import dataAccess.abstracts.ColorRepository;
import entities.concretes.Car;
import entities.concretes.Color;

public class ColorManager implements ColorService {
	ColorRepository colorRepository; 

	public ColorManager(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public Result add(Color color) {
		this.colorRepository.add(color);
		return new SuccessResult();

	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		this.colorRepository.delete(id);
		return new SuccessResult();

	}

	@Override
	public Result update(int id) {
		// TODO Auto-generated method stub
		this.colorRepository.update(id);
		return new SuccessResult();

	}

	@Override
	public SuccessDataResult<List<Color>> getAll() {
        return new SuccessDataResult<List<Color>>(this.colorRepository.getAll());
    }

	@Override
	public Color getById(int id) {
		return this.colorRepository.getById(id);
	}
	

}
