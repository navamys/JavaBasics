package javabasics;

public class Assignment7MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same dimention matrices can only be added.
		int a[][]={{1,2,3},{2,5,4},{2,2,4}};
		int b[][]={{3,4,5},{1,2,6},{7,8,1}};
		int c[][]=new int[3][3];

		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
