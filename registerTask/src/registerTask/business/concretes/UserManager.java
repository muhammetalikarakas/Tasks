package registerTask.business.concretes;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import registerTask.business.abstracts.UserService;
import registerTask.dataAccess.abctracts.UserRepository;
import registerTask.entities.concretes.User;

public class UserManager implements UserService {
	
	UserRepository userRepository;
	public UserManager(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	
	@Override
	public void save(User user) {
		if (check(user)==true) {
			userRepository.add(user);
		}
			

		
		
	}

	@Override
	public boolean check(User user) {
		boolean check=true;
		
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
	    
		for (User item : userRepository.getAll()) {
			
			if (user.getePosta()==item.getePosta() ) {
				System.out.println("aynı e-mail kullanılamaz: "+item.getName());
				check=false;
				
			}
		}
			if (matcher1.matches()!=true && matcher2.matches()!=true && matcher3.matches()!=true && matcher4.matches()!=true) {
				check=false;
			}
			
			System.out.println("hesabınızı doğrulamak için buraya tıklayınız.(click)");
			Scanner scanner=new Scanner(System.in);
			String result =scanner.next();
			if (result.equals("click"))
			{
				
				System.out.println("kaydınız gerçekleşiyor...");
			}else {
				check=false;
				System.out.println("işlem iptal edildi");
			}
			
			
		
		
		
		
		return check;
	}


	@Override
	public List<User> getAll() {
		
		return userRepository.getAll();
	}

}
