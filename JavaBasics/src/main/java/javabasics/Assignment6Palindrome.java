package javabasics;

public class Assignment6Palindrome {

	public static void main(String[] args) {
		// qus is palindrome
		 int num=123214;
		 int givennum=num;
		 int reverse=0;
		 
		 while(num!=0) {
			 int lastdigit=num%10;
			 reverse=reverse*10+lastdigit;
			 num=num/10; 
		 }
		 if(reverse==givennum) {
			 System.out.println(givennum+ " is palindrome");
		 }
		 else {System.out.println(givennum+ " is not palindrome");}

	}

}
