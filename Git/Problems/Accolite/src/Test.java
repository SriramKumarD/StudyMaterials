import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String args[]) {
		String str = "This world is beautiful";
		Map<Character,Integer>  map = new HashMap<Character, Integer>();
		int count = 0;
		int temp = 0;
		String word = "";
		String mWord = "";
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o' || c == 'u') {
				count ++;
				if(map.get(c) != null) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c,1);
				}
			}
			if(count > temp) {
				temp = count;
				
			}
			
		}
		System.out.println();
	}

}
