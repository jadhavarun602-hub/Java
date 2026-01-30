package supplier_ex;

import java.time.LocalDateTime;
import java.util.function.Supplier;

// Use a Supplier<Date> to get the current date and time.

public class Supplier_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDateTime> currentDate = () -> LocalDateTime.now();
		System.out.println("Current Date & Time: "+currentDate.get());
		

	}

}
