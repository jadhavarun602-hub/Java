package thread;

// Create a thread by extending the Thread class and print numbers from 1 to 5.

class T1 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}

public class Thread_1 {

	public static void main(String[] args) {
		
		T1 t = new T1();
		
		t.start();

	}

}
