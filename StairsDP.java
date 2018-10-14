
public class StairsDP {
	
	public static int countDP(int n, int[] map) {
		 if (n<0)
		   return 0;
		 else if (n==0)
		   return 1;
		 else if (map[n]>-1)
		   return map[n];
		 else {
		    map[n] = countDP(n-1, map) + countDP(n-2, map) + countDP(n-3, map);
		    return map[n]; 
		 }
	}
	
	public static void main(String[] args){
		//int[] stairs = {1,2,3};  /111,21,12,3
		int n = 50;
		int[] arr = new int[n+1];
		arr[0]=1;
		for(int i=1; i< n+1; i++){
			arr[i]=-1;
		}
		int sum = countDP(n, arr);
		System.out.println(sum);
	}

	

}
