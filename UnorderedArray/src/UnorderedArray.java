
// find --> o(n)
//insert --> o(1)
//delete --> o(n)
//display --> o(n)

public class UnorderedArray {
	private long[]a;
	private int nElements;
	
	public UnorderedArray(int n) {
		a=new long[n];
		nElements=0;
	}
	
	public int find(long value) {
		for(int i=0;i<nElements;i++) {
			if(a[i]==value)
				return i;
		}
		return -1;
	}
	
	public boolean insert(long value) {
		if(nElements==a.length)
			return false;
		
		else {
			a[nElements++]=value;
			return true;
		}
	}
	
	public boolean delete(long value) {
		if(nElements==0)
			return false;
		
		else {
			int n=find(value);
			if(n==-1)
				return false;
			else {
				for(int i=n+1;i<nElements;i++) {
					a[i-1]=a[i];
				}
				nElements--;
				return true;
			}
		}
	}
	
	public void display() {
		for(int i=0;i<nElements;i++) {
		  System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
	

}
