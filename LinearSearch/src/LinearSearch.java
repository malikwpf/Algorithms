
public class LinearSearch {

	public static void main(String[] args) {
		
		int []arr= {3,5,7,9,1,2};
		int key=10;
		
		System.out.println(LinearSearches(key,arr));

	}
	
	public static int LinearSearches(int key,int []arr) {
		int count=-1;
		for(int k:arr) {
		 
			count++;
			if(k==key) {
				return count;
			}
		}
		
		return -1;
	}

}
