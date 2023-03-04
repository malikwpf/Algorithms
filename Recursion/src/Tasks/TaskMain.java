package Tasks;

public class TaskMain {
	public static void main(String[] args) {
		System.out.println(SumReverse(3));

	}
	
	public static double SumReverse(int n) {
		if(n==1) {
			return 1.0;
		}
		else {
			return (1.0/n)+ SumReverse(n-1);
		}
	}

}
