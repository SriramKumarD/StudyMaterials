

public class QuickSort {

	public static void main(String[] args) {
		int arr[]  = {7,6,10,5,9,2,1,15,7};
	    quickSort(arr, 0, arr.length -1);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	private static void quickSort(int[] arr, int lb, int ub) {
		int loc;
		if(lb < ub) {
			loc = partitioning(arr, lb, ub);
			quickSort(arr, lb, loc -1);
			quickSort(arr, loc + 1, ub);
		}
		
	}

	private static int partitioning(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while(start < end) {
			while(arr[start] <= pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end --;
			}
			if(start < end) {
				//swap(arr[start], arr[end]);
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		if(start > end) {
			//swap(arr[lb], arr[end]);
			int temp = arr[lb];
			arr[lb] = arr[end];
			arr[end] = temp;
		}
		return end;
	}

}
