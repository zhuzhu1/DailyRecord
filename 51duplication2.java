package org.fenixsoft.clazz;


public class TestClass {

	public static int duplication(int a[], int len)
	{
		int i = 0;
		while(i < len)
		{
			int m = a[i];
			if(m == i)
			{
				i++;
			}
			else
			{
				if(m == a[m])
				{
					return m;
				}
				else
				{
					int temp = a[m];
					a[m] = m;
					a[i] = temp;
				}
			}
			
		}
		return -1;
	}
	

	public static void main(String[] args)
	{
		int[] a = {2,3,1,0,2,5,3};
		int r = duplication(a,7);
		System.out.println(r);
		
		int[] a2 = {0,1,2,2,3,3,5};
		int r2 = duplication(a2,7);
		System.out.println(r2);
		
		int[] a3 = {0,1,2,3,4,5,6};
		int r3 = duplication(a3,7);
		System.out.println(r3);
		
		int[] a4 = {2,5,4,1,3,6,0};
		int r4 = duplication(a4,7);
		System.out.println(r4);
		
	}
	
	
}
