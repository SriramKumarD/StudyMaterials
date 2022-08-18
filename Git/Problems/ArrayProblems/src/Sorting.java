
public class Sorting {
	
	//Ascending order

	public static void main(String[] args) {
		int [] arr = {1,5,0,6,2,9};

		int size = arr.length;
		int temp = 0;
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size ; j++) {
			if(arr[i] > arr[j]) {//For descending order arr[i] < arr[j]
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
 			}
		  }
		}
		System.out.println("Ascending order==");
		for(int i = 0; i < size; i++) {
			System.out.print(","+ arr[i]);
		}
	}

}




