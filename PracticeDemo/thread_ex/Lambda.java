package thread_ex;

public class Lambda {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			for(int i = 1; i < 100; i++) {
				
				try {
					
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 1; i < 100; i++) {
				if(i % 2 == 0) {
					try {
						
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println("Even: "+i);
				}
			}
		});
		
		Thread t3 = new Thread(() -> {
			for(int i = 1; i < 100; i++) {
				if(i % 2 != 0) {
					try {
						
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println("Odd: "+i);
				}
			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		
	

	}

}
