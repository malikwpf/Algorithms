package Default;

public class LinkedList {

	Link first=null;
	public LinkedList() {
		first=null;
	}
	
	public void Insert(int i) {
		Link link=new Link(i);
		link.next=first;
		first=link;
	}
	
	public void Display() {
		Link current=first;
		
		while(current != null) {
			current.Display();
			current=current.next;
		}
		
		System.out.println();
	}
	
	public Link Find(int i) {
		Link current=first;
		
		while(current.item != i) {
			if(current.next == null) {
				return null;
			}
			current=current.next;
		}
		
		return current;
	}
	
	public Link Delete(int i) {
		
		Link current=first;
		Link previous=first;
		
		while (current.item!=i) {
			
			if(current.next == null) {
				return null;
			}
			
			previous=current;
			current=current.next;
		}
		
		if(current == first) {
			first=first.next;
		}
		
		else {
			previous.next=current.next;
		}
		
		return current;
	}
	
	public boolean InsertAfter(int key, int newValue) {
		var oldLink=Find(key);
		if(oldLink == null) {
			return false;
		}
		
		var newLink=new Link(newValue);
		
		newLink.next=oldLink.next;
		oldLink.next=newLink;
		
		return true;
		
	}

}
