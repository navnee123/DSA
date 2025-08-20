import java.util.Arrays;

public class anagram {
	
	public static boolean areAnagram(String str1,String str2) {
		String CStr1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String CStr2 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		if(CStr1.length()!=CStr2.length()) {
			return false;
		}
		
		char[] CArray1=CStr1.toCharArray();
		char[] CArray2=CStr1.toCharArray();
		
		Arrays.sort(CArray1);
		Arrays.sort(CArray2);
		
		return Arrays.equals(CArray1, CArray2);
	}
	public static void main(String[] args) {
		  String testStr1a = "Listen";
	        String testStr1b = "Silent";
	        
	        String testStr2a = "Triangle";
	        String testStr2b = "Integral";
	        
	        String testStr3a = "Hello";
	        String testStr3b = "Olelh";
	        
	        System.out.println("\"" + testStr1a + "\" and \"" + testStr1b + "\" are anagrams: " + areAnagram(testStr1a, testStr1b));
	        System.out.println("\"" + testStr2a + "\" and \"" + testStr2b + "\" are anagrams: " + areAnagram(testStr2a, testStr2b));
	        System.out.println("\"" + testStr3a + "\" and \"" + testStr3b + "\" are anagrams: " + areAnagram(testStr3a, testStr3b));
		
	}

}
