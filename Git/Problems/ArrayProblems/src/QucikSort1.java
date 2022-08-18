
public class QucikSort1 {
	
	private static void quickSort(int[] arr, int lb, int ub) {
	
		if(lb < ub) {
			int location = partation(arr, lb, ub );
			quickSort(arr, lb, location - 1);
			quickSort(arr, location + 1, ub);
		}
		
	}

	private static int partation(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		
		while(start < end) {
			while(start <= end && arr[start] <= pivot) {
				start++;
			}
			while(start <= end && arr[end] > pivot) {
				end --;
			}
			if(start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		int temp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp;
		return end;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {7,6,10,5,9,2,1,15,7};

		int lb = 0,ub = arr.length-1;
		quickSort(arr, lb, ub);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

}
