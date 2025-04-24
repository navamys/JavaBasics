package staticmethod.javabasics;

import java.util.Scanner;

public class StaticMethodAssignment9ATM {

	static int balance=500;
	
	public static void checkBalance() 
	{
		System.out.println("Your current balance is: "+balance);
	}
	public static void deposit() 
	{ 
		System.out.println("Enter amount to deposit: ");
		Scanner sc=new Scanner(System.in);
		int amount1=sc.nextInt();
		balance=balance+amount1;
		System.out.println("Deposit success and current balance is: "+balance);
	}
	public static void withdraw() 
	{ 
		System.out.println("Enter amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		int amount2=sc.nextInt();
		if(amount2>balance)
			System.out.println("Sorry, please enter amount within current balance");
		else
		{
			balance=balance-amount2;
			System.out.println("Withdrawal success and current balance is: "+balance);
		}
	}

	public static void main(String args[])
	{ 	int option=1;
		while(option!=0)
		{
			System.out.println("Menu: ");
			System.out.println("To check balance, enter 1");
			System.out.println("To deposit money, enter 2");
			System.out.println("To withdraw money, enter 3");
			System.out.println("To exit, enter 0");
			System.out.println("Enter any of the above option: ");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				StaticMethodAssignment9ATM.checkBalance();
				break;
				case 2:
				StaticMethodAssignment9ATM.deposit();
				break;
				case 3:
				StaticMethodAssignment9ATM.withdraw();
				break;
				case 0:
				System.out.println();
				break;
				default:
				System.out.println("Option not found");
			}
		}
	}


}
