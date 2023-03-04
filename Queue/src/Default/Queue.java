package Default;

public class Queue {
	
	private int[]arr;
	private int maxSize;
	private int nItems;
	private int rear;
	private int front;
	
	public Queue(int n) {
		maxSize=n;
		arr=new int[maxSize];
		nItems=0;
		rear=front=-1;
	}
	
	public void insert(int num) {
		
		if(isFull()) {
			System.out.println("You can not insert there is no room");
			return;
		}
		
		nItems++;
		arr[++rear]=num;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("You can not pop the array is empty");
			return -1;
		}
		nItems--;
		return arr[++front];
	}
	
	public int Peek() {
		return arr[front];
	}
	
	public int size() {
		nItems=nItems>maxSize?maxSize:nItems;
		return nItems;
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public  boolean isFull() {
		return (nItems==maxSize);
	}

}
