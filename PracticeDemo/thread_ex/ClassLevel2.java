package thread_ex;

class L {
	static int num1 = 0;
	 static int num2 = 0;
	
	public synchronized void plus() {
		num1++;
		
		num2++;
	}
}

class L1 extends Thread{
	L num1;
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			num1.plus();
		}
	}
}

class L2 extends Thread{
	L num2;
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			num2.plus();
		}
	}
}

public class ClassLevel2 {

	public static void main(String[] args) throws InterruptedException {
		
		L l = new L();
		
		L1 l1 = new L1();
		L2 l2 = new L2();
		
		l1.num1 = l;
		l2.num2 = l;
		
		l1.start();
		l2.start();
		
		l1.join();
		l2.join();
		
		System.out.println(L.num1);
		System.out.println(L.num2);

	}

}
