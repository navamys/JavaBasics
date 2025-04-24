package staticmethod.javabasics;

import java.util.Scanner;

public class StaticMethodAssignment9Palindrome {
	public static int reverse(int num) {
		int reverse=0;
		while(num!=0) {
			int lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num=num/10;
		}
		return reverse;
	} 
	public static void checkPalindrome() {
		System.out.println("Enter number to check palindrome or not ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=StaticMethodAssignment9Palindrome.reverse(num);
		if(num==reverse) {System.out.println(num+" is palindrome");}
		else {System.out.println(num+" is not palindrome");}
	}
	public static void main(String[] args) {
		StaticMethodAssignment9Palindrome.checkPalindrome();
	}

}
