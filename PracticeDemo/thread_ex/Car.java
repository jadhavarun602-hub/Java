package thread_ex;

class Speed extends Thread{
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println((int)(Math.random()*200)+1);
		}
	}
}

public class Car {

	public static void main(String[] args) throws InterruptedException {
		
		
		Speed s = new Speed();
		s.start();
		
		
		for(int i = 1; i < 10; i++) {
			
			Thread.sleep(1000);
			System.out.println("BMW");
		}
		

	}

}
