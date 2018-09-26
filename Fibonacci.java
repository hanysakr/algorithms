import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args){
		Fibonacci f = new Fibonacci();
		System.out.println("Fibonacc is: " + f.fibonacciDP(1));
		System.out.println("Fibonacc is: " + f.fibonacciDP(2));
		System.out.println("Fibonacc is: " + f.fibonacciDP(3));
		System.out.println("Fibonacc is: " + f.fibonacciDP(4));
		System.out.println("Fibonacc is: " + f.fibonacciDP(5));
		System.out.println("Fibonacc is: " + f.fibonacciDP(6));
		System.out.println("Fibonacc is: " + f.fibonacciDP(7));
		System.out.println("Fibonacc is: " + f.fibonacciDP(1000));
		System.out.println("counter is: " + f.counter);
	}
	
	private static Map<Integer, Long> map;
	public static int counter = 0;
	
	public Fibonacci(){
		map = new HashMap<>();
	}
	
	
	public long fibonacciDP(int n){
		
		if(map.get(n)!=null){
			return map.get(n);
		}else{
			counter++;
			if(n <= 1) return 0;
			if(n == 2) return 1;
	            
			long sum = fibonacciDP(n-1) + fibonacciDP(n-2);
	        map.put(n, sum);   
			return sum;
		}
	}
	
	
	

}
