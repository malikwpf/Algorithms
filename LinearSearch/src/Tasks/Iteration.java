package Tasks;

public class Iteration {

	public static void main(String[] args) {
		
		int []arr= {3,2,7,9,1,2};
		int key=2;
		
		System.out.println(CountIteration(key,arr));

	}
	
	public static int CountIteration(int key,int[]arr) {
		int count=0;
		for(int i:arr) {
			if(i==key) {
				count++;
			}
		}
		
		return count;
	}

}
