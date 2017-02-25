package class2;

public class InclassPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//每次取half更好
	public int power(int a, int b){
		if (b == 0){
			return 1;
		}		
		int resul = 2 * power(a,b-1);
		return resul;
	}

}
