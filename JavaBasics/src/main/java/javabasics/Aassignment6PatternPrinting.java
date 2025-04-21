package javabasics;

public class Aassignment6PatternPrinting {

	public static void main(String[] args) {
		/*print this below pattern
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *  is the question */
		int  i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
