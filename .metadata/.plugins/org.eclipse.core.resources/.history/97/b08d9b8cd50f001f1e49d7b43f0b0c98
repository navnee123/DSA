package Memoziation;

public class climbingByRecursion {
	public climbingByRecursion() {
		for(int i=0;i<this.arr.length;i++) {
			arr[i]=-1;
		}
	}
	 int [] arr=new int[100];
	public int fib(int n) {
		if(n==0 ||n==1) {
			return 1;
		}else if(arr[n]!=-1) {
			return arr[n];
		}else {
			arr[n]=fib(n-1)+fib(n-2);
			return arr[n];
		}
		
	}
	
  public static void main(String[] args) {
	 System.out.println(new climbingByRecursion().fib(10));
}

}
