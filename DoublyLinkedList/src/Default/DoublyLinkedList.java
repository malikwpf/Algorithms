package Default;

public class DoublyLinkedList {

	Link first;
	Link last;
	
	public DoublyLinkedList() {
		first=null;
		last=null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void InsertFirst(int i) {
		var link=new Link(i);
		
		if(isEmpty()) {
			first=link;
			last=link;
		}
		
		else {
			first.previous=link;
			link.next=first;
			link.previous=null;
			first=link;
		}
	}
	
	public void InsertLast(int i) {
		var link=new Link(i);
		
		if(isEmpty()) {
			first=link;
			last=link;
		}
		
		else {
			last.next=link;
			link.previous=last;
			link.next=null;
			last=link;
		}
	}
	
	public void DisplayFirst() {
		Link current=first;
		
		while(current != null) {
			current.Display();
			current=current.next;
		}
		
		System.out.println();
	}
	
	public void DisplayLast() {
		Link current=last;
		
		while(current != null) {
			current.Display();
			current=current.previous;
		}
		
		System.out.println();
	}

	public Link DeleteFirst() {
		
		if(isEmpty()) {
			return null;
		}
		
		Link current=first;
		
		if(first.next == null) {
			last=null;
		}
		else {
			first.next.previous=null;
		}
		
		first=first.next;
		
		return current;
	}
	
	public Link DeleteLast() {
		if(isEmpty()) {
			return null;
		}
		
		Link current=last;
		
		if(first.next==null) {
			first=null;
		}
		
		else {
			last.previous.next=null;
		}
		
		last=last.previous;
		
		return current;
	}
	
	public boolean InsertAfter(int key, int newValue) {
		
		var current=first;
		while(current.item != key) {
			current=current.next;
			if(current == null) {
				return false;
			}
		}
		
		var link=new Link(newValue);
		
		if(current==last) {
			link.next=null;
			last=link;
		}
		else {
			link.next=current.next;
			current.next.previous=link;
		}
		
		link.previous=current;
		current.next=link;
		return true;
	}
	
	public boolean InsertBefore(int key, int newValue) {
		var current=first;
		
		while(current.item != key) {
			current = current.next;
			if(current==null) {
				return false;
			}
		}
		
		var link=new Link(newValue);
		
		if(current==first) {
			current.previous=null;
			first=link;
		}
		else {
			link.previous=current.previous;
			current.previous.next=link;
		}
		
		link.next=current;
		current.previous=link;
		
		return true;
	}
	
}
