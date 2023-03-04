package Default;

public class SelectionSortMain {

	public static void main(String[] args) {
		
		int []arr= {5,4,2,3,1};
		SelectionSort(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	
	public static void SelectionSort(int []arr) {
		int min;
		for(int i=0;i<arr.length-1;i++) {
			min=i;
			for(int k=i+1;k<arr.length;k++) {
				if(arr[min]>arr[k]) {
					min=k;
				}
			}
			Swap(i,min,arr);
		}
	}
	
	public static void Swap(int i,int j, int []arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
