package Register;
public class User {
	private String Name;
	private String Surname;
	private String ePosta;
	private String parola;
	
	public User(String name, String surname, String ePosta, String parola) {
		super();
		Name = name;
		Surname = surname;
		this.ePosta = ePosta;
		this.parola = parola;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
}
