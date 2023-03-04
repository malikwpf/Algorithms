package Default;

public class QueueMain {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		System.out.println(q.isFull());
		
		System.out.println(q.pop());
		System.out.println("Peek: "+q.Peek());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println("Peek: "+q.Peek());
		System.out.println(q.isFull());
	}

}
