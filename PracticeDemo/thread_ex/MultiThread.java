package thread_ex;

class MThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 50; i++) {
			
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				
//			}
			System.out.println(i);
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		
		MThread mt1 = new MThread();
		MThread mt2 = new MThread();
		MThread mt3 = new MThread();
		MThread mt4 = new MThread();
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		
	}

}
