package Videos;

public class BubbleSortMain {

	public static void main(String[] args) {
		int []arr= {10,6,7,3,21,4,2,1,2,1};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int k=0;k<arr.length-1-i;k++) {
				if(arr[k]>arr[k+1]) {
					Swap(arr, k, k+1);
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	
	public static void Swap(int []arr,int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}
