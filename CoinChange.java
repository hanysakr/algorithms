import java.util.Arrays;
import java.util.Scanner;


public class CoinChange {

		static long[][] cache;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] coins = new int[m];
			for (int i = 0; i < coins.length; i++) {
				coins[i] = sc.nextInt();
			}

			cache = new long[n + 1][m];
			for (int i = 0; i < cache.length; i++) {
				Arrays.fill(cache[i], -1);
			}

			Arrays.sort(coins);
			//System.out.println(count(coins, n, coins.length - 1));
			System.out.println(count(coins, coins.length, n));
			sc.close();
		}

		/*static long solve(int[] coins, int remain, int index) {
			if (remain == 0) {
				return 1;
			}

			if (index == 0) {
				return remain % coins[0] == 0 ? 1 : 0;
			}

			if (cache[remain][index] >= 0) {
				return cache[remain][index];
			}

			long result = 0;
			for (int i = 0; i * coins[index] <= remain; i++) {
				result += solve(coins, remain - i * coins[index], index - 1);
			}
			cache[remain][index] = result;
			return result;
		}*/
		
		static int count( int S[], int m, int n ) 
	    { 
	        // If n is 0 then there is 1 solution  
	        // (do not include any coin) 
	        if (n == 0) 
	            return 1; 
	          
	        // If n is less than 0 then no  
	        // solution exists 
	        if (n < 0) 
	            return 0; 
	      
	        // If there are no coins and n  
	        // is greater than 0, then no 
	        // solution exist 
	        if (m <=0 && n >= 1) 
	            return 0; 
	      
	        // count is sum of solutions (i)  
	        // including S[m-1] (ii) excluding S[m-1] 
	        return count( S, m - 1, n ) + 
	               count( S, m, n-S[m-1] ); 
	    } 
	
}
