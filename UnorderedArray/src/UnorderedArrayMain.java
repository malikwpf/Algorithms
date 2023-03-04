
public class UnorderedArrayMain {

	public static void main(String[] args) {
		
		UnorderedArray ua=new UnorderedArray(5);
		ua.insert(5);
		ua.insert(7);
		ua.insert(16);
		ua.insert(9);
		ua.insert(8);
		
		int index=ua.find(2);
		if(index==-1)
			System.out.println(2+": Not found");
		else {
			System.out.println(2+": Found");
		}
		
		index=ua.find(7);
		if(index==-1)
			System.out.println(7+": Not found");
		else {
			System.out.println(7+": Found");
		}
		
		ua.delete(15);
		ua.display();
		ua.delete(7);
		ua.delete(8);
		ua.delete(5);
		
		ua.display();
	
	}
}
