package registerTask.business.abstracts;

import java.util.List;

import registerTask.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	void save(User user);
	boolean check(User user);
}
