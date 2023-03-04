package Default;

public class Link {

	int item;
	Link next;
	Link previous;
	
	public Link(int i) {
		item=i;
	}
	
	public void Display() {
		System.out.print(item+ " ");
	}

}
