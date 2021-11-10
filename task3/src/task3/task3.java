package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {

	public static void main(String[] args) {

		Integer[] array = { 15, 24, 4, 58, 21 };
		Integer[] newarray = {};
		boolean chack = false;

		List ls = new ArrayList(Arrays.asList(newarray));
		for (int x = 0; x < array.length; x++) {

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[i] < array[j]) {
						chack = true;
					}
				}
				if (chack == false && array[i]!=0) {
					ls.add(array[i]);
					array[i] = 0;
				} else {
					chack = false;
				}

			}
		}
		newarray = (Integer[]) ls.toArray(newarray);
		System.out.println(" New Array: " + Arrays.toString(newarray));

	}

}
