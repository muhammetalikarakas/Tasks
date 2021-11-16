package Register;


public class JdbdUserDao implements UserDao {

	@Override
	public void addUser() {
		System.out.println("Kullanıcı Jdbc ile kaydoldu:");
	}
	

}
