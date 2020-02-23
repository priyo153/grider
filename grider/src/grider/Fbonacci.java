package grider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fbonacci {
	
	public static void main(String[] args) {
		
		fib(50);
		System.out.println(fib2(50));
		System.out.println(fib3(50));
		System.out.println(fib2(50));
	}
	
	
	static Map<Long,Long> mem=new HashMap<>();
	
	
	public static long fib2(long n) {
		
		long val;
		if(n<2)
		{
			
			return n;
		}
		
		
		if(mem.containsKey(n)) {
			return mem.get(n);
		}
		val= fib2(n-1)+fib2(n-2);
		mem.put(n, val);
		
		return val;
		
	}
	
	
	public static long fib3(long n) {
		
		long val;
		if(n<2)
		{
			
			return n;
		}
		
		
		
		val= fib3(n-1)+fib3(n-2);
		
		
		return val;
		
	}
		
		
	
	public static void fib(int n) {
		
		int series[]=new int[n];
		series[0]=0;
		series[1]=1;
		
		for(int i=2;i<n;i++) {
			
			series[i]=series[i-1]+series[i-2];
		}
		
		System.out.println(Arrays.toString(series));
	}

}
