
public class MergeSort {
	static int[] SortedArr;
	private static void mergeSort(int[] arr, int lb, int ub) {
		
		if(lb < ub) {
			int mid = (lb+ub)/2;
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid+1, ub);
			merge(arr, lb, mid, ub);
		}
		
	}
	
	private static void merge(int[] arr, int lb, int mid, int ub) {
		int i = lb,j = mid+1,k = lb;
		
		while(i <= mid && j <= ub) {
			if(arr[i] <= arr[j]) {
				SortedArr[k] = arr[i];
				i++;
			}
			else {//arr[i] >= arr[j] 
				SortedArr[k] = arr[j];
				j++;
			}
			k++;
		}
		/* if(i > mid) { */
			while(j <= ub) {
				SortedArr[k] = arr[j];
				j++;k++;
			}
	/*	}*/
		/*
		 * else {//j > ub
		 */			while(i <= mid) {
				SortedArr[k] = arr[i];
				i++;k++;
			}
		/* } */
		
	}

	public static void main(String args[]) {
		int[] arr = {3,56,4,3,2,9,14,1};
		SortedArr = new int[arr.length];
		int lb = 0,ub = arr.length - 1;
		mergeSort(arr,lb, ub);
		for(Integer val : SortedArr) {
			System.out.print(","+val);
		}
		
	}

}
