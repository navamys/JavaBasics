package javabasics;

import java.util.Scanner;

public class Assignment7Bubblesort {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		//sort
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
			}
		}
		//print a[i]
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
