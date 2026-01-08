package arrayList_ex;

import java.util.ArrayList;

// Remove duplicate elements from an ArrayList.

public class ArrayList_24 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(34);
		num.add(78);
		num.add(90);
		num.add(23);
		num.add(78);
		num.add(23);
		
		System.out.println("Original: "+num);
	
		for(int i = 0; i < num.size(); i++) {
			for(int j = i+1; j < num.size(); j++) {
				if(num.get(i).equals(num.get(j))) {
					num.remove(j);
					j--;
				}
			}
		}
		
		System.out.println("remove duplicate: "+num);

	}

}
