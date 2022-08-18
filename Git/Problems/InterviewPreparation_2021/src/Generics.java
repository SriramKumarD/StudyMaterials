import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without generics
		List str = new ArrayList();
		str.add("10");
		str.add(10);

		List<String> string = new ArrayList<String>();
		string.add("Sriram");
		string.add("kumar");
		//string.add(10);//Compile time checking 
		
		for(String st : string) {
			System.out.println("Checking>>="+st);
		}
		
		System.out.println("TypeCasting is not required="+string.get(0));
		
		Iterator<String> itr = string.iterator();
		while(itr.hasNext()) {
			System.out.println("Using iterator="+itr.next());
		}
		
	}

}
