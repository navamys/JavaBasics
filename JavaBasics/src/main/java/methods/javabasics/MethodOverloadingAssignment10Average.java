package methods.javabasics;

public class MethodOverloadingAssignment10Average {
	public int average(int a,int b,int c) {
		int avg=(a+b+c)/2;
		return avg;
	}
	public float average(float a,float b) {
		float avg=(a+b)/2;
		return avg;
	}
	public static void main(String[] args) {
		MethodOverloadingAssignment10Average object=new MethodOverloadingAssignment10Average();
		System.out.println("average of integers "+object.average(5, 3, 0));
		System.out.println("average of floats "+object.average(1.2f,2.3f));

	}

}
