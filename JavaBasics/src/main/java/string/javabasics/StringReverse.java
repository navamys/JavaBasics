package string.javabasics;

public class StringReverse {

	public static void main(String[] args) {
		/*
		//directlyuse a method for reverse inside buffer or builder class
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		*/
		
		String s="Navamy S";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			char character=s.charAt(i);
			reverse=reverse+character;
		}
		System.out.println("reversed string is "+reverse);
	}

}
