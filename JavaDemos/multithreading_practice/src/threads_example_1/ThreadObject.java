package threads_example_1;

public class ThreadObject extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {			
			System.out.println(Thread.currentThread().getName()+" says : "+i);
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
