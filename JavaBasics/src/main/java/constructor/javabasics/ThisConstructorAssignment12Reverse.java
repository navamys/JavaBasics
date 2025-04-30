package constructor.javabasics;

public class ThisConstructorAssignment12Reverse {
	int num;
	int reverse=0;
	public ThisConstructorAssignment12Reverse() {
		this(1234);
		System.out.println("constructor without para");
		
	}
	public ThisConstructorAssignment12Reverse(int num) {
		System.out.println("constructor with para");
		this.num=num;
		this.findReverse(num);
	}
	public void findReverse(int num) {
		
		while(num!=0) {
			int lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num=num/10;
		}
		System.out.println("reverse is "+reverse);
		
	}

	public static void main(String[] args) {
		ThisConstructorAssignment12Reverse obj=new ThisConstructorAssignment12Reverse();

	}

}
