package staticmethod.javabasics;

public class StaticMethodAssignment9Voting {
	/*public static void vote(int age) {
		if(age>=18) {System.out.println("Eligible for vote");}
		else {System.out.println("Not eligible");}
	}
	public static void main(String[] args) {
		StaticMethodAssignment9Voting.vote(10);

	}
*/
	
	//OR
	public static boolean vote(int age) 
	{
		boolean eligible;
		if(age>=18)
			eligible=true;
		else
			eligible=false;
		
		return eligible;
	}

	public static void main(String args[])
	{ 
		boolean e=StaticMethodAssignment9Voting.vote(23);
		if(e==true)
			System.out.println("Candidate is eligible for voting");
		else
			System.out.println("NOT eligible");
	}

}
