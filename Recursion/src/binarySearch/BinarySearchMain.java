package binarySearch;

public class BinarySearchMain {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		System.out.println(BinarySearch(-4, a, 0, a.length-1));
		
	}

	
	public static int BinarySearch(int key, int[]a, int lower, int higher) {
		
		int index=(lower+higher)/2;
		if(key==a[index]) {
			return index;
		}
		
		else if(lower>higher || higher<lower) {
			return -1;
		}
		
		if(a[index]>key) {
			return BinarySearch(key, a, lower, index-1);
		}
		
		else {
			return BinarySearch(key, a, index+1, higher);
		}
	}
}
