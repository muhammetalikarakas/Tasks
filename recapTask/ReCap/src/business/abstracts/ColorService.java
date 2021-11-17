package business.abstracts;

import java.util.List;

import core.utilites.result.DataResult;
import core.utilites.result.Result;
import entities.concretes.Color;

public interface ColorService {
	Result add(Color color);
	Result delete(int id);
	Result update(int id);
	DataResult<List<Color>> getAll();
	Color getById(int id);
}
