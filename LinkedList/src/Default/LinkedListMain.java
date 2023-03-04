package Default;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		
		linkedList.Insert(1);
		linkedList.Insert(2);
		linkedList.Insert(3);
		linkedList.Insert(3);
		linkedList.Insert(4);
		linkedList.InsertAfter(3, 100);
		linkedList.Display();
		
		Link l=linkedList.Find(5);
		
		if(l==null) {
			System.out.println("Not found");
			}
		
		else {
			System.out.println(l.item);
		}
		
		linkedList.Delete(3);
		
		linkedList.Display();

	}

}
