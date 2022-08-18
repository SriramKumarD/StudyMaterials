import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorThread {
	boolean isFinal = false;
	int  count = 0;
	List<String> list = new ArrayList<String>();
	void executeT(String name) throws InterruptedException{
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		
		executor.submit(new Runnable() {

		@Override
		public void run() {

			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		while (count <= 100000) {
					/*
					 * try { Thread.sleep(500); } catch (InterruptedException e) { // TODO
					 * Auto-generated catch block e.printStackTrace(); }
					 */
			list.add("String"+count+name);
			count ++;
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
		if (Thread.currentThread().isInterrupted()) {
		System.out.println("interrupted");
		break;
		}
		}
		}
		});
		executor.shutdown();
		try {
			
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		
		System.out.println("running");
		System.out.println("Exiting normally...");
		System.out.println("List"+list);
		}

	public static void main(String args[]) throws InterruptedException{
		ExecutorThread t1 = new ExecutorThread();
		t1.executeT("Sriram");
		
	}
}