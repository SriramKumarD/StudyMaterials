
public class Testing1 {
	
	private static StringBuilder str;

	public static void main(String[] args) {
		
		String s = "testing";
		
		Testing1 obj = new Testing1();
		str = new StringBuilder();
		obj.reverseString(s, s.length());
		
		System.out.println(str.toString());
		/*
		 * for (int i=0; i<s.length(); i++) { for (int j = 0; j<s.length(); j++) {
		 * 
		 * System.out.println(s.charAt(i)+ "," + s.charAt(j)); } }
		 */

	}

	public void reverseString(String s, int length) {
		
		if (length>=0) {
			str.append(s.charAt(length-1));
			reverseString(s, length-1);
		}
	}

}
