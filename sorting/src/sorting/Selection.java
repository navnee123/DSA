package sorting;

public class Selection {
	
	
void sort(int [] arr) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int min=i;
	 for(int j=i+1;j<n;j++) {
		 if(arr[j]<arr[min]) {
			 min=j;
			 
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		
		}
	 }
	 }
}
   
void print(int [] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
	}
}

public static void main(String[] args) {
	
	 Selection so=new Selection();
	 int [] arr= {56,34,98,83,29};
	 System.out.println("sorted array");
	 so.sort(arr);
	 System.out.println("print the array");
	 so.print(arr);
	 
}

}
