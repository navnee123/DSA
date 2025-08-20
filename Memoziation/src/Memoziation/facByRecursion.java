package Memoziation;

public class facByRecursion {
	public facByRecursion() {
		for(int i=0;i<this.arr.length;i++) {
			arr[i]=-1;
		}
	}
	
	long [] arr= new long[100];
	
	public long facByMemo(long n) {
		long fac=0;
	   if(n==0 || n==1) {
		   return n;
	   }else if(arr[(int)n]!=-1) {
		   return arr[(int)n];
	   }else {
		   fac=facByMemo(n-1)*n;
		   arr[(int)n]=fac;
		   return fac;
	   }
	}
	
	
	public static void main(String[] args) {
		System.out.println(new facByRecursion().facByMemo(25));
	}

}
