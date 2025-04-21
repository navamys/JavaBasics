package javabasics;

public class Assignment6Fibonacci {

	public static void main(String[] args) {
		// Qus is Fibonacci
		int num=12;
		int a=0;
		int b=1;
		System.out.print("0 1 ");
		for(int i=0;i<num;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}


	}

}
