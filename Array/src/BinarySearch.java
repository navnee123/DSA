import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		//int [] arr= {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
		
		Scanner sc=new Scanner(System.in);
		//check input is integer or not
		int size=0;
		System.out.println("enter the num");
		if(sc.hasNextInt()) {
			size=sc.nextInt();
		}
		
	   // size of array
		int [] arr=new int [size];
		
		System.out.println();
		
		System.out.println("Enter the element");
		for(int j=0;j<size;j++) {
			//if(sc.hasNextInt()) {
				arr[j]=sc.nextInt();
			//}
		}
		
		
		System.err.println("Enter the num to be find: ");
		int find=sc.nextInt();
		int i=0;
		int j=0;
		int k=arr.length-1;
		int count=0;
		for(i=0;i<arr.length;i++) {
//			j=0;
//			k=arr.length-1;
			while(j<=k) {
				count++;
				int m=j+(k-j)/2;
				
				if(find==arr[m]) {
				  System.err.println("element found "+find);
				  System.out.println("index "+count);
				 // System.out.println("index "+m);
				  return;
				}
				
				
				if(arr[m]>find) {
					k=m-1;
				}else {
					j=m+1;
				}
				
			}
			count++;
			
		}
		System.out.println("element not found");
		
		System.out.println("no of iterations : "+i);
	}

}
