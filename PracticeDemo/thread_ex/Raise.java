package thread_ex;

class Number{
	int num = 0;
	
	public void Increse() {
		this.num++;
	}
}

class One extends Thread{
	
	Number num;
	
	 @Override
	public void run() {
		for(int i = 1; i <= 5000;i++) {
			num.Increse();
		}
	}
}

class Two extends Thread {
	
	Number num;
	
	 @Override
	public void run() {
		for(int i = 1; i <= 5000;i++) {
			num.Increse();
		}
	}
}

public class Raise {

	public static void main(String[] args) throws InterruptedException {
		
		Number number = new Number();
		
		One one = new One();
		Two two = new Two();
		
		one.num = number;
		two.num = number;
		
		one.start();
		two.start();
		
		
		Thread.sleep(1500);
		System.out.println(number.num);

	}

}
