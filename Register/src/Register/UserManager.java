package Register;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserServices {
	User user =new User("ahmet","kaya","kaya.ahmet@gmail.com","1234568");
	public UserDao userDao;
	



	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		
	}



	public void save() {
		String mailregex = "^(.+)@(.+)$";
		String nameregex = "[A-Za-z ]{2,30}";
		String passwordregex ="^.{6,}$";
		
		Pattern pattern1 = Pattern.compile(mailregex);
		Pattern pattern2 = Pattern.compile(nameregex);
		Pattern pattern3 = Pattern.compile(passwordregex);
		
	    Matcher matcher1 = pattern1.matcher(user.getePosta());
	    Matcher matcher2 = pattern2.matcher(user.getName());
	    Matcher matcher3 = pattern2.matcher(user.getSurname());
	    Matcher matcher4 = pattern3.matcher(user.getParola());
	    
	    System.out.println(matcher1.matches());
	    System.out.println(matcher2.matches());
	    System.out.println(matcher3.matches());
	    System.out.println(matcher4.matches());
		
		if (matcher1.matches()==true && matcher2.matches()==true && matcher3.matches()==true && matcher4.matches()==true) {
			
			System.out.println("hesabınızı doğrulamak için buraya tıklayınız.(click)");
			Scanner scanner=new Scanner(System.in);
			String result =scanner.next();
			System.out.println(result);
			if (result.equals("click"))
			{
				userDao.addUser();
				System.out.println("kaydınız gerçekleşiyor...");
			}else {
				System.out.println("işlem iptal edildi");
			}
			
			
		}else {
			System.out.println("geçersiz düzen");
		}
		 
		
		

	}

}
