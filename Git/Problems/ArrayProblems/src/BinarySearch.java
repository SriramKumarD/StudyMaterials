
public class BinarySearch {
	private static int binarySearchIterator(int[] a, int key) {
	
		int left = 0, right = a.length -1;
		while(left < right) {
			int mid = (left + right)/2;
			if(key == a[mid]) {
				return mid;
			}
			else if(key < a[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;                                                         
	}
	private static int binarySearchRecursive(int[] a, int key, int left, int right) {
		if(left > right) {
			return -1;
		}
		int mid = (left + right)/2;
		if(key == a[mid]) {
			return mid;
		}
		else if(key < a[mid]) {
			return binarySearchRecursive(a, key, left, mid -1);
		}
		else {
			return binarySearchRecursive(a, key, mid+1, right);
		}
	}
	public static void main(String args[]) {
		int a[] = {3,4,7,9,12,20,45,78,98};
		
		int key = 100;
		
		int position = binarySearchRecursive(a, key, 0, a.length-1);
		int positionItr = binarySearchIterator(a, key);
		
		if(position != -1) {
			System.out.println("Recursive: The value is found at:"+position);
		}
		else {
			System.out.println("Recursive: The value is not Found....");
		}
		if(positionItr != -1) {
			System.out.println("Iterator: The value is found at:"+positionItr);
		}
		else {
			System.out.println("Iterator: The value is not Found....");
		}
		
	}
}
