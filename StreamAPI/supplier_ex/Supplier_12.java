package supplier_ex;

import java.util.function.Supplier;

// Use a Supplier<Integer> to generate OTP numbers.

public class Supplier_12 {

	public static void main(String[] args) {
		
		Supplier<Integer> otp = () -> (int)(Math.random() * 9000) + 1000;
		System.out.println("OTP: "+otp.get());

	}

}
