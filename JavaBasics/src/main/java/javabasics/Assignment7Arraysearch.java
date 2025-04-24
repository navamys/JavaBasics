package javabasics;

import java.util.Scanner;

public class Assignment7Arraysearch {

	public static void main(String[] args) {
		// Qus is array search
		System.out.println("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		System.out.println("Enter elements: ");
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to search: ");
		int num=sc.nextInt();
		boolean b=false;
		int count=0;
		for(int j=0;j<size;j++) {
			if(a[j]==num) {b=true; ++count;}
		}
		
		if(b==true) {System.out.println("found");}
		else {System.out.println("not found");}
		
		System.out.println("count of found elements is "+count);

	}

}
