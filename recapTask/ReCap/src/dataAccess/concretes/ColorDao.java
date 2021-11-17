package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ColorRepository;
import entities.concretes.Color;

public class ColorDao implements ColorRepository{
	
	List<Color> colors;
	
	public ColorDao() {
		colors = new ArrayList<Color>();
	}

	@Override
	public void add(Color color) {
		colors.add(color);
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public void update(int id ) {
		System.out.println("istenilen renk eklendi "+ colors.get(id));
	}

	@Override
	public List<Color> getAll() {
		// TODO Auto-generated method stub
		return colors;
	}

	@Override
	public Color getById(int id) {
		for(Color item : colors) {
			if(item.getId() == id) 
				return item;
		}
		return null;
	}
}
