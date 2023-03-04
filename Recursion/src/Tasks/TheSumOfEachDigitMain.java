package Tasks;

public class TheSumOfEachDigitMain {

	static int count;
	static int sum=0;
	public static void main(String[] args) {
		System.out.println(SumDigits(11));

	}
	
	public static int SumDigits(int n) {
		if(n/10>0) {
			sum+=n%10;
			return SumDigits(n/10);
		}
		else {
			return sum+n;
		}
	}

}
