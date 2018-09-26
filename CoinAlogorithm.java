import java.util.HashMap;
import java.util.Map;

public class CoinAlogorithm {
	
	public static void main(String[] args){
		CoinAlogorithm coinAlg = new CoinAlogorithm();
		int[] coins = {1,5,6,9,100};
		System.out.println(coinAlg.minCoins(coins,13));
	}
	
	private static Map<Integer, Integer> map;
	
	public CoinAlogorithm(){
			map = new HashMap<>();
	}
	
	public int minCoins(int[] coins, int sum) {

		if (sum == 0)
			return 0;

		if (map.get(sum) != null) {
			return map.get(sum);
		} else {
			int numberOfCoins = 0;
			int min = 999999;

			for (int counter = 0; counter < coins.length; counter++) {
				if (sum >= coins[counter]) {
					numberOfCoins = 1 + Math.min(min, minCoins(coins, sum - coins[counter]));

					if (numberOfCoins < min)
						min = numberOfCoins;
				}

			}
			map.put(sum, min);
			return min;
		}
	}
}
