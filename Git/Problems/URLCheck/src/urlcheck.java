import java.net.MalformedURLException;
import java.net.URL;

public class urlcheck {

	public static void main(String[] args) throws MalformedURLException {
		
		String url = "https://yar-india-xsp23.t3.broadsoft.com";
		
		URL orgUrl = new URL(url);
		System.out.println(orgUrl.getHost());
		
		checking("UTF-8");
	}

	private static void checking(String object) {
		object = null;
			
		if(object != null) {
			System.out.println("Not null");
		}
		else {
			object = null;
			System.out.println("Null");
			
		}
	}

}
