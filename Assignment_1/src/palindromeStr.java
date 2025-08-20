import java.util.Scanner;

public class palindromeStr {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
				
		if(Checkpalindrome(str)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	public static boolean Checkpalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
	return true;	
	}

}
