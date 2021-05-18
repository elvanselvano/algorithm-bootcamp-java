import java.lang.Thread.State;

public class ThreadingApp {
	
	public ThreadingApp() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					System.out.println("t1: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			}
		});
		
		System.out.println(t1.getState());
		
		
		
		t1.start();
		
//		State s = new State();
		
		if(t1.getState() == "TERMINATED") {
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println(t1.getState());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println(t1.isAlive());
		System.out.println(t1.getState());
	}
	
	public static void main(String[] args) {
		new ThreadingApp();
	}
}
