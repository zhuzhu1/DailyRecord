package org.fenixsoft.clazz;

public class TestClass {
	
	public static void printClockWise(int M[][], int m, int n)
	{
		int imin = 0, imax = m-1;
		int jmin = 0, jmax = n-1;
		int i = imin, j = jmin;
		while(imin<=imax && jmin <= jmax)
		{
			for(j = jmin;j <= jmax;j++)
			{
				System.out.print(M[i][j]+" ");
			}
			imin++;
			j = jmax;
		
			if(imin<=imax && jmin <= jmax)
			{
				for(i = imin; i <= imax;i++)
				{
					System.out.print(M[i][j]+" ");
				}
				jmax--;
				i = imax;
			}
		
			if(imin<=imax && jmin <= jmax)
			{
				for(j = jmax;j >= jmin; j--)
				{
					System.out.print(M[i][j]+" ");
				}
				imax--;
				j = jmin;
			}
			
			if(imin<=imax && jmin <= jmax)
			{
				for(i = imax; i >= imin;i--)
				{
					System.out.print(M[i][j]+" ");
				}
				jmin++;
				i = imin;
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int M[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printClockWise(M, 4, 4);
		
		
		int M2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		printClockWise(M2, 3, 4);
		
		int M3[][] = {{1},{2}};
		printClockWise(M3, 2, 1);
		
		int M4[][] = {{1,2}};
		printClockWise(M4, 1, 2);
	}
}
