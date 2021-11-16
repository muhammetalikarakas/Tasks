package northwind.dataAccess.abctracts;

import java.util.List;

public interface DaoRepository<T> {
	void add(T t);
	void delete(T t);
	void update(T t);
	T getById(int id);
	List<T> getAll();
}
