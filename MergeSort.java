
public class MergeSort {
	
	
	public static void main(String args[]){
		int[] arr = {5,4,6,2,1,10,7,3,8,9};
		
		new MergeSort(arr);
	}
	
	public MergeSort(int[] arr){
		mergeSort(arr);
	}
	
	public void mergeSort(int[] arr){
		if(arr.length == 1){
			return;
		}
		
		int midIndex = arr.length/2 + arr.length % 2;
		int[] _1Arr = new int[midIndex];
		int[] _2Arr = new int[ arr.length - midIndex];
		
		split(arr, _1Arr, _2Arr);
		
		mergeSort(_1Arr);
		mergeSort(_2Arr);
		
		merge(arr, _1Arr, _2Arr);
		print(arr);
		
	}
	
	
	/**
	 * Split the arr into two sub-arrays
	 * 
	 * @param arr
	 * @param _1Arr
	 * @param _2Arr
	 */
	private void split(int[] arr, int[] _1Arr, int[] _2Arr){
		int index = 0;
		int _2Index = _1Arr.length;
		for(int element:arr){
			if(index < _2Index){
				_1Arr[index] = arr[index];
			}else{
				_2Arr[index-_2Index] = arr[index];
			}
			index++;
		}
	}
	
	/**
	 * Merging two sub-arrays to one array.
	 * 
	 * @param arr
	 * @param _1Arr
	 * @param _2Arr
	 */
	private void merge(int[] arr, int[] _1Arr, int[] _2Arr){
		int mergeIndex = 0;
		int _1Index = 0;
		int _2Index = 0;
		
		while(_1Index < _1Arr.length && _2Index < _2Arr.length){
			if(_1Arr[_1Index] < _2Arr[_2Index]){
				arr[mergeIndex] = _1Arr[_1Index];
				_1Index++;
			}else if(_2Index < _2Arr.length){
				arr[mergeIndex] = _2Arr[_2Index];
				_2Index++;
			}
			mergeIndex++;
		}
		
		if(_1Index < _1Arr.length){
			while(mergeIndex < arr.length){
				arr[mergeIndex++] = _1Arr[_1Index++];
			}
		}
		
		if(_2Index < _2Arr.length){
			while(mergeIndex < arr.length){
				arr[mergeIndex++] = _2Arr[_2Index++];
			}
		}
	}
	
    private void print(int[] arr){
    	for(int element:arr){
    		System.out.print(element + ",");
    	}
    	System.out.println("--------------");
    }
}
