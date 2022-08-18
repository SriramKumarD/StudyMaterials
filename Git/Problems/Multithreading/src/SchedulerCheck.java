
public class SchedulerCheck extends Thread {
	
	protected static final String THREAD_NAME = "Trunk Group User Creation Thread";
	public static SchedulerCheck schedulerCheck;
	SchedulerCheck()
	{
	super(THREAD_NAME);

	this.start();
	}
	
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			System.out.println("running...");
		}
		System.out.println("After interrupt=="+schedulerCheck);
	}
	
	private static void shutdown() throws InterruptedException {
		schedulerCheck.interrupt();
		schedulerCheck.join();
		System.out.println("Status:"+schedulerCheck.getId());
		
	}

	
	public static void init()throws Exception
	{
	
	
	if (schedulerCheck == null) {
		System.out.println("Starting=="+schedulerCheck);
		schedulerCheck = new SchedulerCheck();
	}
		
	}
	public static void main(String[] args) throws Exception {
		init();
		System.out.println("ThreadName:"+schedulerCheck.getName());
		System.out.println("Thread:"+schedulerCheck.getId());
		shutdown();
		schedulerCheck.interrupt();
		System.out.println("Status:"+schedulerCheck.getId());
		/*
		 * schedulerCheck = new SchedulerCheck() ;
		 * System.out.println("StatusAfter:"+schedulerCheck.isInterrupted());
		 * System.out.println("ThreadName:"+schedulerCheck.getName());
		 * System.out.println("Thread:"+schedulerCheck.getId());
		 */
	}

	
}
