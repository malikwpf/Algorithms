package Default;

public class Stack {

	int []arr;
	int maxLength;
	int index;
	
	public Stack(int n) {
		maxLength=n;
		arr=new int[maxLength];
		index=-1;
	}
	
	public void Push(int element) {
		arr[++index]=element;
	}
	
	public int Pop() {
		return arr[index--];
	}
	
	public int Peek() {
		return arr[index];
	}
	
	public boolean isEmpty() {
		return (index==-1);
	}
	
	public boolean isFull() {
		return(index==maxLength-1);
	}

}
