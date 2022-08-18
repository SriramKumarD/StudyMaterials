
public class FirstNonrepeatingChar {
	
	 static final int charSize = 256;
	
	 static char[] count;
	
	private static char findNonReaotingChar(String string) {
		count = new char[charSize];
		
		for(int i = 0; i<string.length(); i++) {
			
			count[string.charAt(i)]++;
		}
		
		//0,,0,0,0,0
		
		for(int j = 0; j<string.length(); j++) {
			if(count[string.charAt(j)] == 1) {
				return string.charAt(j);
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		char t = 0;
		
		String[] strs = {"apaple","rabbrazeit","checkiehng"};
		
		for(int i = 0; i<strs.length; i++) {
			t = findNonReaotingChar(strs[i]);
					
			System.out.println(t);
		}
	}



}
