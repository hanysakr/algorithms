
public class QuickSort {
	
	public static void main(String args[]){
		int[] arr = {5,4,6,2,1,10,7,3,8,9};
		
		new QuickSort(arr,0,arr.length-1);
	}
	
	public QuickSort(int[] arr, int low, int high){
		quickSort(arr, low, high);
	}
	
	private void quickSort(int[] arr, int low, int high){
		if(low >= high){
			return;
		}
		int pivotIndex = partition(arr, low, high);
		quickSort(arr, low, pivotIndex-1);
		quickSort(arr, pivotIndex+1, high);
	}


	private int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int l = low;
		int h = high;
		while(l < h){
			while(arr[l] <= pivot && l < h){
				l++;
			}
			while(arr[h] > pivot){
				h--;
			}
			if(l < h){
				swap(arr, l, h);
			}
		}
		swap(arr, low, h);
		
		System.out.println("pivot:" + pivot);
		print(arr);
		return h;
	}
	
	private void swap(int[] arr, int low, int high){
		int temp = arr[high];
		arr[high] = arr[low];
		arr[low] = temp;
	}
	
	
	private void print(int[] arr){
    	for(int element:arr){
    		System.out.print(element + ",");
    	}
    	System.out.println("--------------");
    }



}


