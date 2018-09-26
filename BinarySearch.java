
public class BinarySearch {

	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66,77,88,99,110};
		new BinarySearch(arr, 99);
		
	}
	
	public BinarySearch(int[] arr, int number){
		int index = binarySearch(arr, number);
		System.out.println(index);
	}
	
	private int binarySearch(int[] arr, int number){
		int min = 0;
		int max = arr.length - 1;
		
		while(min <= max){
			int mid = min + (max - min)/2;
			
			if(arr[mid] == number){
				return mid;
			}
			if(arr[mid]> number){
				max = mid - 1;
			}else{
				min = mid + 1;
			}
		}
		return -1;
	}
}
