package Default;

public class PrioriQueueMain {

	public static void main(String[] args) {
		
		PrioriQueue pq=new PrioriQueue(5);
		pq.insert(1);
		pq.insert(2);
		pq.insert(5);
		pq.insert(3);
		pq.insert(4);
		
		System.out.println("Is Full: "+pq.isFull());
		
		while(!pq.isEmpty()) {
			System.out.println(pq.Delete());
		}
		
		System.out.println("Is Empty: "+pq.isEmpty());
	}

}
