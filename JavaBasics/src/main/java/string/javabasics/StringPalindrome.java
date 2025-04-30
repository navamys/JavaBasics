package string.javabasics;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="Malayalam";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			char character=s.charAt(i);
			reverse=reverse+character;
		}
		
		if(s.equalsIgnoreCase(reverse)) {System.out.println("string is palindrome");}
		else {System.out.println("string is not palindrome");}
	}

}
