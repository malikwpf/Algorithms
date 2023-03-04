package Default;

public class PrioriQueue {
	
private int[]arr;
private int maxsize;
private int nItems;

public PrioriQueue(int num) {
	this.maxsize=num;
	arr=new int[num];
	nItems=0;
}

public void insert(int item) {
	if(nItems==0) {
		arr[nItems++]=item;
	}
	else {
		int  i;
		for(i=nItems-1;i>=0;i--) {
			if(item>arr[i]) {
				arr[i+1]=arr[i];
			}
			else {
				break;
			}
		}
		arr[i+1]=item;
		nItems++;
	}
}

public int Delete() {
	return arr[--nItems];
}

public boolean isEmpty() {
	return (nItems==0);
}

public boolean isFull() {
	return (nItems==this.maxsize);
}

}
