package Tasks;

public class UnorderArrayTask {

	private Long[]a;
	int nElements=0;
	
	public UnorderArrayTask(int n) {
		a=new Long[n];
		nElements=0;
	}
	
	public int find(int value) {
		if(nElements==0) {
			return -1;
		}
		else {
			for(int i=0;i<nElements;i++) {
				if(a[i]==value);
				return i;
			}
			
			return -2;
		}
	}
	
	public boolean InsertByIndex(long val,int index) {
		if(nElements==a.length)
			return false;
		
	     else if(a[index]==null) {
	    	 a[index]=val;
	    	 nElements++;
	     }
	     
	     else {
	    	 nElements++;
	    	 for(int i=nElements-1;i>index;i--) {
	    		 a[i]=a[i-1];
	    	 }
	    	 
	    	 a[index]=val;
	    	 
	     }
		
		return true;
		
	}
	
	public void display() {
		for(int i=0;i<nElements;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public boolean DeleteByIndex(int index) {
		if(index>=nElements || nElements==0) {
			return false;
		}
		
		else {
			for(int i=index+1;i<nElements;i++) {
				a[i-1]=a[i];
			}
			nElements--;
			System.out.print("\n");
		
		}
		
		return true;
	}
}
