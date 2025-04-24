package staticmethod.javabasics;

import java.util.Scanner;

public class StaticMethodAssignment8Factorial {
	static int num;
	public static void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial ");
		num=sc.nextInt();
	}
	public static void findFactorial() {
		int product=1;
		for(int i=1;i<=num;i++) {
			product=product*i;
		}
		System.out.println("Factorial of "+num+" is "+product);
	}
	public static void main(String[] args) {
		StaticMethodAssignment8Factorial.read();
		StaticMethodAssignment8Factorial.findFactorial();
		

	}

}
