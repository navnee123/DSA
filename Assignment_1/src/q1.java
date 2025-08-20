
public class q1 {
		
		

		public static void main(String[] args) {
			
			
			
			int arr[]={5,1,7,4,9,3};
			
			bubbleSort(arr);
			
			int x=1;
			int start=0;
			int end=arr.length-1;
			int count =0;
			
				while(start<=end){
					count++;
					int mid=start+(end-start)/2;
					if(arr[mid] == x)
					{
						
						//System.out.println(arr[mid]); 
						System.out.println(mid);
						System.out.println(count);
						return;
						
						}
					
					if(arr[mid]<x) {
						start=mid+1;
					}
					else {
						end=mid-1;
					}
					
	             }
			System.out.println("not found");
			
		
			
			
			


		}
		public static  void bubbleSort(int[]arr)
		{
			int n=arr.length;
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
					if(arr[j-1]>arr[j])
					{
						int temp=arr[j];
						 arr[j]=arr[j-1];
						 arr[j-1]=temp;
						
					}
				}
			}
		}
		 public  void print(int [] arr) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
			
		}
		
}


