import java.util.Arrays;

public class BinarySearch {

	//In binary search we must have a sorted array
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,15,15,9,8,7,6,5,10};
		int key=5;
		
		
		System.out.println(_BinarySearch(arr, key));

	}
	
	public static int _BinarySearch(int []arr,int key) {
		Arrays.sort(arr);
		
		int lower=0;
		int upper=arr.length-1;
		int index=0;//Default value we can instantiate it with any value
		
		/*for(int num:arr) {
			System.out.print(num+" ");
		}
		
		System.out.println('\n');*/
		//Just for demonstration
		
		while(true) {
			index=(lower+upper)/2;
			
			if(arr[index]==key)
				return index;
			else if(upper<lower || lower>upper)
				return -1;
			
			else if(arr[index]>key) 
				upper=index-1;
		    else if(arr[index]<key)	
		    	lower=index+1;
			
		}
	}

}
