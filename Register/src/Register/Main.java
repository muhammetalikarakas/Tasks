package Register;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user =new User("ahmet","kaya","kaya.ahmet@gmail.com","123456");
		
		UserManager userServices=new UserManager(new JdbdUserDao());
		
		
		userServices.save();


	}

}
