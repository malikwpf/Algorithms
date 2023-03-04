package Tasks;

public class UnorderArrayTaskMain {

	public static void main(String[] args) {

		UnorderArrayTask uat=new UnorderArrayTask(5);
		uat.InsertByIndex(0, 0);
		uat.InsertByIndex(1, 1);
		uat.InsertByIndex(2, 2);
		uat.InsertByIndex(3, 3);
		//uat.InsertByIndex(5, 4);
		uat.InsertByIndex(6,0);
		uat.display();
		
		uat.DeleteByIndex(1);
		uat.display();
		
	}

}
