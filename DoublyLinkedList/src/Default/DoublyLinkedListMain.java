package Default;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
		doublyLinkedList.InsertFirst(1);
		doublyLinkedList.InsertFirst(2);
		doublyLinkedList.InsertFirst(3);
		doublyLinkedList.InsertFirst(4);
		
		doublyLinkedList.InsertAfter(2, 7);
		doublyLinkedList.InsertBefore(2, 6);
		
		//doublyLinkedList.DeleteFirst();
		//doublyLinkedList.DeleteLast();
		doublyLinkedList.DisplayFirst();
		doublyLinkedList.DisplayLast();

	}

}
