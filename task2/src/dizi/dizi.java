package dizi;

import java.util.*;

public class dizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer array1[] = { 15, 44, 1, 98, 5, 1, 69, 6, 44, 1 };
		Integer array[] = array1;
		Integer newarray[] = {};

		boolean chack = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < newarray.length; j++) {
				if (array[i] == newarray[j]) {
					chack = true;
				}
			}
			if (chack == false) {
				List add = new ArrayList(Arrays.asList(newarray));
				add.add(array[i]);
				newarray = (Integer[]) add.toArray(newarray);
			}
		}
		System.out.println(" New Array: " + Arrays.toString(newarray));

	}

}
