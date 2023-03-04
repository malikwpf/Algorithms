
public class OrderedArrayMain {

	public static void main(String[] args) {
		OrderedArray oa=new OrderedArray(5);
		oa.Insert(5);
		oa.Insert(3);
		oa.Insert(4);
		oa.Insert(1);
		oa.Insert(2);
		
		oa.Display();
		
		oa.Delete(5);
		oa.Delete(1);
		oa.Delete(5);
		oa.Delete(3);
		oa.Delete(6);
		
		oa.Display();

	}

}
