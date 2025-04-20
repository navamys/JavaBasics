package javabasics;

public class Assignment5b {

	public static void main(String[] args) {
		// find grade
		int totalmark=41;
		if(totalmark<40) {System.out.println("failed");}
		else if(totalmark<=60) {System.out.println("grade is D");}
		else if(totalmark<=70) {System.out.println("grade is C");}
		else if(totalmark<=80) {System.out.println("grade is B");}
		else if(totalmark<=100) {System.out.println("grade is A");}
		else {System.out.println("Invalid mark");}
	}

}
