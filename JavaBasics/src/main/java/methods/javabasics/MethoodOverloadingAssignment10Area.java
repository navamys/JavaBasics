package methods.javabasics;

public class MethoodOverloadingAssignment10Area {
	public float area(float a) {
		//area of circle
		float area=3.14f*a*a;
		return area;
	}
	public int area(int a) {
		//area of square
		int area=a*a;
		return area;
	}
	public int area(int a,int b) {
		//area of rectangle
		int area=a*b;
		return area;
	}
	public static void main(String[] args) {
		MethoodOverloadingAssignment10Area object=new MethoodOverloadingAssignment10Area();
		System.out.println("area of circle "+object.area(1.2f));
		System.out.println("area of square "+object.area(5));
		System.out.println("area of rectangle "+object.area(2, 3));

	}

}
