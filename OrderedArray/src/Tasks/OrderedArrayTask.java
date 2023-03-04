package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderedArrayTask {
	long [] a;
	int nElements;
	
	public OrderedArrayTask(int n) {
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
	
	public double getAverage() throws Exception {
		if(nElements == 0) {
			throw new Exception("The devider can't be zero");
		}
		double sum=0;
		for(int i=0;i<nElements;i++) {
			sum+=a[i];
		}
		
		return sum/nElements;
	}
	
	public long getFrequentNumber(OrderedArrayTask arr) throws Exception {
		if(nElements==0) {
			throw new Exception("The array is empty");
		}
		
		int ind=-1;
		int freq=0;
		
		for(int i=0;i<nElements;i++) {
			long num=a[i];
			int sum=0;
			for(int j=0;j<nElements;j++) {
				if(a[j]==num) {
					sum++;
				}
			}
			
			if(sum>freq) {
				freq=sum;
				ind=i;
			}
		}
		
		return a[ind];
	}
	
}
