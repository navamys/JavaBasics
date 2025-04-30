package methods.javabasics;

public class MethodsAssignement11Discount {

	public int calculateTotalAmount(int price1,int price2,int price3)
	{
		int total=price1+price2+price3;
		return total;
	}

	public void checkDiscount(int a)
	{
		float discountcalc;
		if(a>5000)
		{	
			System.out.println("Congrats, you are eligible for 20% discount");
			discountcalc=0.8f*a;
			System.out.println("Your final amount is: "+discountcalc);
		}
		else
		{	
			System.out.println("Sorry, you are not eligible for discount");
			discountcalc=a;
			System.out.println("Your final amount is: "+discountcalc);
		}

	}

	public static void main(String args[])
	{ 
		MethodsAssignement11Discount obj=new MethodsAssignement11Discount(); 
		int total=obj.calculateTotalAmount(500,300,5000);
		System.out.println("Your total price is "+total);
		obj.checkDiscount(total);

		
	}


	}


