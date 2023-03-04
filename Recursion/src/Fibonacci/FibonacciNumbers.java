package Fibonacci;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		System.out.println(FbNum(5));
	}
	
	public static int FbNum(int n) {
		if(n<=1) {
			return n;
		}
		
		else {
			return FbNum(n-1)+FbNum(n-2);
		}
	}

}
