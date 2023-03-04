package Default;

public class RecursionMain {
	static int sum=0;
	public static void main(String[] args) {
		System.out.println(Tri(50000000));
	}

	public static int Tri(int n) {
		
		if(n==1) {
			return ++sum;
		}
		else {
			sum+=n;
			return Tri(n-1);
		}
	}
}
