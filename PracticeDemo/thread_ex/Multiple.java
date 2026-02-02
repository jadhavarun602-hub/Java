package thread_ex;

class T1 extends Thread{
	
	public void run() {
		for(int i = 1; i < 100; i++) {
		   System.out.println("I am Thread 1");
		}
	}
}

class T2 extends Thread{
	
	public void run() {
		for(int i = 1; i < 100; i++) {
			System.out.println("I am Thread 2");
		}
	}
}

class T3 extends Thread{
	
	public void run() {
		for(int i = 1; i < 100; i++) {
			System.out.println("I am Thread 3");
		}
	}
}

public class Multiple {

	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		T3 t3 = new T3();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
