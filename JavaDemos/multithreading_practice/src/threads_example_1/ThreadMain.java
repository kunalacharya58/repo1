package threads_example_1;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadObject t1 = new ThreadObject();
		t1.setName("T1");
		
		ThreadObject t2 = new ThreadObject();
		t2.setName("T2");
		
		ThreadObject t3 = new ThreadObject();
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
//		for (int i = 1; i < 6; i++) {
//			System.out.println("\n"+Thread.currentThread().getName()+" says : "+i);
//			try {
//				Thread.sleep(1200);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//
//		}
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done here!");
		
	}

}
