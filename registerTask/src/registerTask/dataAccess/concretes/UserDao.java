package registerTask.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import registerTask.dataAccess.abctracts.UserRepository;
import registerTask.entities.concretes.User;

public class UserDao implements UserRepository {
	
	List<User> users;
	
	
	public UserDao() {
		super();
		this.users = new ArrayList<User>();
	}


	public List<User> getAll(){
		return users;
	}


	@Override
	public void add(User user) {
		
		users.add(user);
		
	}

}
