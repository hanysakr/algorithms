
public class GcdAlgorithm {
	
	public static void main(String[] args) {
		GcdAlgorithm m = new GcdAlgorithm();
		System.out.println(m.gcdIterative(1500, 48));
		System.out.println(m.gcdRecursive(1500, 48));				
	}
	
	// x % y = s
	// y % s
	// y % (x % y)
	public int gcdIterative(int x, int y){
		while(y != 0){
			int result = y;
			y = x % y; // 21 % 14 = 1*14 + 7 
 			x = result;
		}
		return x;
	}

	public int gcdRecursive(int x, int y){
		if(y == 0) return x;
		
		return gcdRecursive(y, x % y);
	}

	
	 
}
