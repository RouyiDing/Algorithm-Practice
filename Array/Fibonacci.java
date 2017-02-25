package class2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(6));
		
	}

	// recursion
	public static long fibonacci_1(int K){
		if (K <= 0){
			return 0;
		}
		if (K == 1){
			return 1;
		}
	
		return fibonacci_1(K-1) + fibonacci_1(K-2);
	}
	
	//dp O(1)
	public static long fibonacci(int K){
		if (K == 1){
			return 1;
		}
		long a = 0;
		long b = 1;
		long sum = 0;
		while (K > 1){
			sum = a + b;
			K--;
			a = b;
			b = sum;
		}
		
		return sum;
	}
	
}
