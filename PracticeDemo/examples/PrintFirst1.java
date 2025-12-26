package examples;

import java.util.LinkedList;
import java.util.List;

// list = {111,2341,1011,7761,9999,null,6679,1143,143,691,69}

public class PrintFirst1 {

	public static void main(String[] args) {
		

		
		List <Integer> list = new LinkedList<Integer>();
		
		list.add(111);
		list.add(2341);
		list.add(1011);
		list.add(7761);
		list.add(9999);
		list.add(null);
		list.add(6679);
		list.add(1143);
		list.add(143);
		list.add(691);
		list.add(69);
		
		
		for(int i = 0 ; i < list.size() ;i++) {
			
			
//			System.out.println(list.get(i));
			
			Integer list2 = list.get(i);
			
			if (list2 != null) {                     
                String s = list2.toString();         

                if (s.charAt(0) == '1') {          
                    System.out.println(list2);
                }
            }
			
			
		}
		

	}

}
