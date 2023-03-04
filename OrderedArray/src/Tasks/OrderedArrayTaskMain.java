package Tasks;

public class OrderedArrayTaskMain {

	public static void main(String[] args) throws Exception {
		
		OrderedArrayTask arr=new OrderedArrayTask(5);
		arr.Insert(1);
		arr.Insert(2);
		arr.Insert(5);
		arr.Insert(5);
		
		System.out.println(arr.getAverage());
		System.out.println(arr.getFrequentNumber(arr));
	}

}
