package thread;

// Create a thread by implementing Runnable and print numbers from 1 to 5.

class T2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
}

public class Thread_2 {

	public static void main(String[] args) {
		
		T2 t2 = new T2();
		
	   Thread t = new Thread(t2);
	
	   t.start();
	

	}

}
