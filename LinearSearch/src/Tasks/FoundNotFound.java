package Tasks;

public class FoundNotFound {

	public static void main(String[] args) {
		
		int []arr= {3,5,7,9,1,2};
		int key=2;
		
		boolean DidFind=LinearSeach(key,arr);
		
		if(DidFind)
			System.out.println("Found");
		else
		System.out.println("NotFound");

	}

	public static boolean LinearSeach(int key,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return true;
			}
		}
		
		return false;
	}
}
