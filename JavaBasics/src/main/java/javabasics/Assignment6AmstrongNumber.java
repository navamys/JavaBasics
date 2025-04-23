package javabasics;

public class Assignment6AmstrongNumber {

	public static void main(String[] args) {
		//Qus is amstrong number
		int givennum=372;
		
		int num=givennum;
		int count=0;
		while(num!=0) {
			num=num/10;
			++count;
		}
		
		
		int sum=0;
		int num1=givennum;
		
		while(num1!=0) {
			int lastdigit=num1%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*lastdigit;
			}
			sum=sum+power;
			num1=num1/10;
		}
		if(sum==givennum) {System.out.println(givennum+" is amstrong");}
		else {System.out.println(givennum+" is not amstrong");}    
		

		

	}

}
