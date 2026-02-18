package thread_ex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Framework {

	public static void main(String[] args) {
		
		try(ExecutorService ex = Executors.newFixedThreadPool(2)){
			
			for(int i = 0; i < 10; i++) {
				int n = i;
				
				ex.submit(() ->{
					System.out.println("First: "+n+Thread.currentThread().getName());
				});
				
				ex.submit(() ->{
					System.out.println("Second: "+n+Thread.currentThread().getName());
				});
			}
		}
		
		System.out.println("all clear...");
		
		
	}

}
