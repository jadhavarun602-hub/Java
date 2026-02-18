package thread_ex;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_ex {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		
		
		Callable<Integer> ca = ()->{
			return 45;
		};
		
	Future<Integer> fu = executor.submit(ca);
		
		
		System.out.println(fu.get());
		
		executor.shutdown();
	}

}
