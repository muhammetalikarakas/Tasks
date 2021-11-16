package registerTask;


import registerTask.business.abstracts.UserService;
import registerTask.business.concretes.UserManager;
import registerTask.dataAccess.concretes.UserDao;

import registerTask.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService= new UserManager(new UserDao());
		userService.save(new User("ahmet","kaya","kaya.amet@gmail.com","123456"));
		userService.save(new User("ahmet","kaya","kaya.amet@gmail.com","123456"));

		for (User user: userService.getAll()) {
			System.out.println(user.getName());
		}
		
	}

}
