import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class Loto {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rnd=new Random();
		int r=0;
		System.out.println("bir sayi girin:");
		int s1=scanner.nextInt();
		Integer [] array=new Integer[s1];
		
		for (int i=0;i<s1;i++) {
			r=rnd.nextInt(50);
			array[i]=r;

		}
		System.out.println(Arrays.toString(array));	
		
		
	}

}
