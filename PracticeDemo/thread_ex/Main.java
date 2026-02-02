package thread_ex;

class NewThread extends Thread{
	
	public void run() {
		for(int i = 1; i<=100; i++) {
			System.out.println("Running NewThread class....");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		NewThread nt = new NewThread();
		nt.start();
		
		for(int i = 1; i<=100;i++) {
			System.out.println("Running Main class....");
		}

	}

}
