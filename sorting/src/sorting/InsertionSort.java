package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr= {56,34,98,83,29};
		InsertionSort is=new InsertionSort();
		is.sort(arr);
		is.print(arr);
	}
	public void sort(int [] arr) {
		int temp=Integer.MIN_VALUE;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			for( j=i;(j>0 && arr[j-1]>temp);j--) {
				arr[j]=arr[j-1];
				}
			arr[j]=temp;
		}
		
	}
	
	
	void print(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
