package thread_ex;

class Level{
	
	static int plus = 0;
	
	public void increse() {
		
		synchronized(Level.class) {
			plus++;
		}
		
//		this.plus++;
	}
}

class Level1 extends Thread{
	Level plus;
	
	public void run() {
		for(int i = 0; i < 1000;i++) {
			plus.increse();
		}
	}
}

class Level2 extends Thread{
	
	Level plus;
	
	public void run() {
		for(int i = 0; i < 1000; i++) {
			plus.increse();
		}
	}
}

public class ClassLevel {

	public static void main(String[] args) throws InterruptedException {
		
		Level level = new Level();
		
		Level1 level1 = new Level1();
		Level2 level2 = new Level2();
		
		level1.plus = level;
		level2.plus = level;
		
		level1.start();
		level2.start();
		
		level1.join();
		level2.join();
		
		
	   System.out.println(level.plus);

	}

}
