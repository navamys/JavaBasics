package javabasics;

public class Assignment6Primenumber {

	public static void main(String[] args) {
		// qus is primenumber
		int num=6;
		boolean a=true;
		
		if(num<2) {    //to handle 0 and 1
			System.out.println(num+" is not prime");
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {a =false;}
				break;
			}
			
			if(a==true) {System.out.println(num+" is prime");}
			else {System.out.println(num+" is not prime");}
		}
	}

}
