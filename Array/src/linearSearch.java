import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {
		int [] arr= {23,45,64,83,29,58};
		Scanner sc=new Scanner(System.in);
		//liner search
		System.out.println("enter the num to be find");
		int find=sc.nextInt();
		
		boolean found=false;
		int count=0;
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(find==arr[i]) {
				
				found=true;
				System.out.println("find the num : "+find);
				break;
			}
			count++;
			
		}
		System.out.println("index : "+count);
		if(!found) {
			System.out.println("elemnt not found");
		}
		System.out.println("no of iterations : "+i);
		
	}
}
