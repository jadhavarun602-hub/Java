package thread_ex;


public class Raise_Con {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		First f = new First(c);
		Second s = new Second(c);
		
		
//		f.count = count;
		
		f.start();
		s.start();

		Thread.sleep(1200);
		
		System.out.println(c.count);
		
		
	}

}
class Counter {
	
	int count = 1 ;
	
	public void increase() {
		count++;
	}
}


class First extends Thread{
	
	Counter count;
	
	 @Override
	public void run() {
		for(int i = 0; i< 1000; i++) {
			count.increase();
		}
	}
	First(Counter count){
		this.count = count;
	}
	
}

class Second extends Thread{
	
	Counter count;
	
	 @Override
	public void run() {
		for(int i = 0; i< 1000; i++) {
			count.increase();
		}
	}
	
	Second(Counter count){
		this.count = count;
	}
}
