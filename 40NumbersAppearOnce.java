package org.fenixsoft.clazz;


public class TestClass {

	public static void findNumsAppearOnce(int a[], int len)
	{
		int resultXOR = 0;
		for(int i = 0; i < len; i++)
		{
			resultXOR = resultXOR ^ a[i];
		}
		
		int indexBit = findFirstBitIs1(resultXOR);
		int num1 = 0, num2 = 0;
		
		for(int i = 0; i < len; i++)
		{
			if(isBit1(a[i],indexBit))
			{
				num1 ^= a[i];
			}
			else
			{
				num2 ^= a[i];
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static int findFirstBitIs1(int num)
	{
		int indexBit = 0;
		while((num & 1) == 0)
		{
			num = num >> 1;
			indexBit++;
		}
		return indexBit;
	}
	
	public static boolean isBit1(int num,int indexBit)
	{
		num = num >> indexBit;
		if((num & 1) == 1)
		{
			return true;
		}
		return false;
	}
	

	public static void main(String[] args)
	{
		int[] a = {2,4,3,6,3,2,5,5};
		findNumsAppearOnce(a,8);
		
		int[] a2 = {4,6};
		findNumsAppearOnce(a2,2);
	}
	
	
}
