package constructor.javabasics;

public class ConstructorAssignment11Grade {
	int mat;int eng;int comp;
	public ConstructorAssignment11Grade(int maths,int english,int computer) {
		mat=maths;
		eng=english;
		comp=computer;
	}
	
	public void findGrade(String name) {
		int total=mat+eng+comp;
		if(total>100)
			System.out.println(name+"'s mark is Invalid");
		else if(total>80)
			System.out.println(name+"'s grade is A");
		else if(total>60)
			System.out.println(name+"'s grade is B");
		else if(total>40)
			System.out.println(name+"'s grade is C");
		else
			System.out.println(name+"'s grade is F-failed");	

	}

	public static void main(String[] args) {
		ConstructorAssignment11Grade student1=new ConstructorAssignment11Grade(0,20,30);
		student1.findGrade("student1");
		ConstructorAssignment11Grade student2=new ConstructorAssignment11Grade(40,50,0);
		student2.findGrade("student2");
		

	}

}
