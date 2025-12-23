package arrays_ex;

//Merge two arrays into a single array.

public class Array_19 {

	public static void main(String[] args) {
		
		int [] arr1 = {12,34,56,87,56,45};
		int [] arr2 = {32,557,87,54,32,23,11,};
		
		int [] merge = new int[arr1.length + arr2.length];
		
		int index = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			merge[index++] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			merge[index++] = arr2[i];
		}
		
		for(int i = 0; i < merge.length; i++) {
			
			System.out.print(merge[i]+" ");
		}

	}

}
