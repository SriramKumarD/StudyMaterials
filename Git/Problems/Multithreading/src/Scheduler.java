import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
	private void task() {
		ScheduledExecutorService exService = Executors.newSingleThreadScheduledExecutor();
	    int voipTokenRefreshInterval = 60;

	    exService.scheduleAtFixedRate(new Runnable() {
	        @Override
	        public void run() {
	          System.out.println("Running.....");
	          }
	        }, 0, voipTokenRefreshInterval, TimeUnit.SECONDS);
	}
	public static void main(String arg[]) {
		
		Scheduler obj = new Scheduler();
		obj.task();
	}
}
