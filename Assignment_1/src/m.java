import java.util.Scanner;

public class m {

	    


	    public static boolean isMagicNumber(int num) {
	    	if(num<10) {
	    		return num==1;
	    	}
	    	
	    	int sum=0;
	    	while(num>0) {
	    		sum+=num%10;
	    		num/=10;
	    	}
	    	return isMagicNumber(sum);
	      
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (isMagicNumber(number)) {
	            System.out.println(number + " is a magic number.");
	        } else {
	            System.out.println(number + " is not a magic number.");
	        }
	        
	    }
	}