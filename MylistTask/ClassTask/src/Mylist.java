import java.util.Arrays;
import java.util.Iterator;

public class Mylist {
	String[] array =null;

	public void add(String item) {
		if (this.array != null) {

			String[] dummy = new String[this.array.length];

			for (int i = 0; i < this.array.length; i++) {
				dummy[i] = this.array[i];
			}
			this.array = new String[this.array.length + 1];
			for (int i = 0; i < dummy.length; i++) {
				this.array[i] = dummy[i];
			}
			this.array[this.array.length-1] = item;
		}else {
			this.array=new String[1];
			this.array[0]=item;
		}
		
	}
	public void list() {
		for (String string : this.array) {
			System.out.println(string);
		}
	}
	
	public boolean contains(String item) {
		boolean result=false;
		for (String string : this.array) {
			if (string==item) {
				result= true;
				break;
			}else {
				result= false;
			}
		}
		return result;

	}
	public void remove(String item) {
		int count=0;
		for (String string : this.array) {
			if (string==item) {
				count ++;
			}
		}
		String[] dummy = new String[this.array.length-count];
		for (int i = 0; i < dummy.length; i++) {
			for (int j = 0; j < this.array.length; j++) {
				if (this.array[j]!= item) {
					dummy[i]=this.array[j];
					break;
				}
			}
		}
		this.array = new String[dummy.length];
		for (int i = 0; i < dummy.length; i++) {
			this.array[i]=dummy[i];
		}		
	}
	

}
