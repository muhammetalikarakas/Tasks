
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashMap <String, String> capitalCities = new MyHashMap<String, String>();
		
		capitalCities.Put("turkey", "istanbul");
	    capitalCities.Put("England", "London");
	    capitalCities.Put("Germany", "Berlin");
	    capitalCities.Put("Norway", "Oslo");
	    capitalCities.Put("USA", "Washington DC");;
		
	    System.out.println( capitalCities.get("turkey"));
		capitalCities.remove("turkey");
		System.out.println( capitalCities.get("turkey"));
		System.out.println(capitalCities.size());
		capitalCities.clear();
		System.out.println( capitalCities.get("Germany"));

	}

}
