
public class towerofHanoi {
	
	public static void main(String[] args) {
		int disks=3;
		SolveHanoi(disks,'A','B','C');
	}

	public static void SolveHanoi(int n,char source,char aux,char target) {
		if(n==1) {
			System.out.println("Move disk 1 from "+source+" to "+target);
			return;
		}
		
		SolveHanoi(n-1,source,aux,target);
		
		System.out.println("Move disk "+n+" from "+source+" to "+target);
		
		SolveHanoi(n-1,aux,source,target);
		
		
	}
}
