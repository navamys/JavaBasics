package constructor.javabasics;

public class ThisConstructorAssignment12Factorial {

	int num;
	int result=1;
	public ThisConstructorAssignment12Factorial()
	{
		this(3);
		System.out.println("Factorial of given number is: "+result);
	}
	public ThisConstructorAssignment12Factorial(int num)  
	{
		this.num=num;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
	}
	public static void main(String args[])
	{ 
		ThisConstructorAssignment12Factorial obj1=new ThisConstructorAssignment12Factorial(); 
	}

}
