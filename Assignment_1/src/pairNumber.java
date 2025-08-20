
public class pairNumber {
	
	public static void main(String[] args) {
		String str="11101111011101111111011";
		int pairCount=pairnum(str);
		System.out.println("Number of '11' pairs: " + pairCount);
	}
	public  static int pairnum(String str) {
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == '1' && str.charAt(i+1)=='1') {
				count++;
				i++;
			}
		}
		return count;
	}

}
