import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String, String> depEntries = new HashMap<String, String>();
		String s = "|_0.0,6|_0.1,7|_0.2,10|_0.3,11|_0.4,0|_0.5,0|_0.6,23";
				
		String[] strA = s.split("\\|");
		String[] s1 = null ;
		for(String str : strA) {
			if(!str.isEmpty()) {
			s1 = str.split("\\,");
			depEntries.put(s1[0], s1[1]);
			}
			
			}
		String t1 = depEntries.get("_0.1");
		if(t1 != null) {
			System.out.println("dddd");
		}
		System.out.println("DATA"+depEntries);
		
		}
				

	}
