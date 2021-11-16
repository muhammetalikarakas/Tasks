package registerTask.dataAccess.abctracts;

import java.util.List;

import registerTask.entities.concretes.User;

public interface UserRepository {
	public List<User> getAll();
	public void add(User user);

}
