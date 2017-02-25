package class2;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,4));

	}
	
	public static long power_1(int a, int b){
		// write your solution here
		if (b == 0){
			return 1;
		}
		
		return power_1(a, b-1)*a;
		
	}

	
	public static long power(int a, int b){
		//base case
		if (b <= 0){
			return 1;
		}
		//recursion
		long half = power(a,b/2);
		return b % 2 == 0 ? half * half : half * half * a;
	}
}
