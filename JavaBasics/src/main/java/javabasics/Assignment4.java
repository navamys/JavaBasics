package javabasics;

public class Assignment4 {

	public static void main(String[] args) {
		//1:check num is positive
		int x=5;
		if(x>0) {System.out.println("number is positive");}
		else if(x<0) {System.out.println("number is negative");}
		else {System.out.println("invalid entry");}
		
		//2:driving license eligibility
		int age=19;
		if(age>=18) {System.out.println("Eligible for driving license");}
		else {System.out.println("Not eligible for driving license");}
		
		//3:odd or even
		int num=6;
		if(num%2==0) {System.out.println("number is even");}
		else {System.out.println("number is odd");}
		
	}

}
