package arrays_ex;

//Remove duplicate elements from an array.

public class Array_13 {

	public static void main(String[] args) {
		
		int [] element = {23,45,76,77,89,35,76,24,76};
		
		for(int i = 0; i < element.length; i++) {
			
			boolean isDup = false;
			
			
			for(int j = 0; j < i;j++) 
			{
				if(element[i] == element[j]) 
				{
					isDup = true;
					break;
				}
			}
			
		    if(!isDup) {
		    	System.out.print(element[i]+" ");
		    }
		}

	}

}
