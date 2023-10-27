package package1;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static List<Integer> generateFibonacci(int limit){
		List<Integer> fibonacciList = new ArrayList<>();
		int a=0, b=1;
		while (a <= limit) {
			fibonacciList.add(a);
			int next =a+b;
			a=b;
			b=next;
		}
		return fibonacciList;
	}
}