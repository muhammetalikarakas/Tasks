
public class Main {

	public static void main(String[] args) {
		Mylist list=new Mylist();
		list.add("kars");
		list.add("kars");
		list.add("ardahan");
		
		list.list();
		System.out.println(list.contains("kars"));
		list.remove("kars");
		
	}

}
