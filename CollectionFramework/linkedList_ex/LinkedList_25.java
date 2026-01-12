package linkedList_ex;

import java.util.LinkedList;

// Remove duplicate elements from a LinkedList.

public class LinkedList_25 {

	public static void main(String[] args) {
		
		LinkedList<Integer> temp = new LinkedList<>();
		
		temp.add(43);
		temp.add(12);
		temp.add(43);
		temp.add(11);
		temp.add(45);
		temp.add(12);
		temp.add(84);
		temp.add(11);
		temp.add(90);
		
		for(int i = 0; i < temp.size(); i++) {
			for(int j = i +1; j < temp.size(); j++) {
				if(temp.get(i) == temp.get(j)) {
					System.out.println(temp.remove(j));
					j--;
				}
			}
		}
		
		System.out.println(temp);

	}

}
