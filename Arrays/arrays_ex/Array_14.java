package arrays_ex;

//Insert an element at a specific position in an array.

public class Array_14 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		int [] newArr = new int[arr.length +1];
		
		int element = 35;
		int position = 3;
		
		for(int i = 0; i < newArr.length; i++) {
			if(i < position) {
				newArr[i] = arr[i];
			}else if(i == position){
				newArr[i] = element;
			}else {
				newArr[i] = arr[i-1];
			}
		}
		
		 for (int i = 0; i < newArr.length; i++) {
	            System.out.print(newArr[i] + " ");
	        }
	}

}
