import org.w3c.dom.ls.LSOutput;

//Find -->O(log(n))
//Insert -->O(log(n))
//Delete -->O(log(n)+n)=O(n)
//Display -->O(n)
public class OrderedArray {

	long [] a;
	int nElements;
	
	public OrderedArray(int n) {
		a=new long[n];
		nElements=0;
	}
	
	public int Find(long val) {
		if(nElements==0)
			return -1;
		for(int i=0;i<nElements;i++) {
			if(val==a[i])
				return i;
		}
		
		return -1;
	}
	
	public boolean Insert(long val) {
		if(nElements==a.length)
			return false;
		
		if(nElements==0) {
			a[0]=val;
			nElements++;
		}
		
		else {
		int i;
		for(i=0;i<nElements;i++) {
			if(val<a[i])
				break;
		}
		
		nElements++;
		for(int j=nElements-1;j>i;j--) {
			a[j]=a[j-1];
		}
		a[i]=val;
		}
		
		return true;
	}
	
	public boolean Delete(long val) {
		if(nElements==0 || Find(val)==-1)
			return false;
		
		for(int i=Find(val)+1;i<nElements;i++) {
			a[i-1]=a[i];
		}
		nElements--;
		return true;
	}
	
	public void Display() {
		for(int i=0;i<nElements;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
