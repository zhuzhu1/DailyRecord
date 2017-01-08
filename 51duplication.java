package org.fenixsoft.clazz;


public class TestClass {

	public static int duplication(int a[], int len)
	{
		int[] tempArr = new int[len];
		for(int i = 0; i < len; i++)
		{
			tempArr[i] = 0;
		}
		for(int i = 0;i < len; i++)
		{
			int newIndex = a[i];
			tempArr[newIndex]++;
			if(tempArr[newIndex] >= 2)
			{
				return newIndex;
			}
		}
		return -1;
	}
	

	public static void main(String[] args)
	{
		int[] a = {2,3,1,0,2,5,3};
		int r = duplication(a,7);
		System.out.println(r);
		
	}
	
	
}
