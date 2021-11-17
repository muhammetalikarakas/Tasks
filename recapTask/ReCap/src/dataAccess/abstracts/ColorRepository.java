package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Color;

public interface ColorRepository {
	void add(Color color);
	void delete(int id);
	void update(int id);
	List<Color> getAll();
	Color getById(int id);
}
