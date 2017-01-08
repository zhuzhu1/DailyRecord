package org.fenixsoft.clazz;


public class TestClass {

	public static int getNumber(int middle, int a[], int len, int k)
	{
		int count = 1;
		int i = middle-1;
		for(;i>=0;i--)
		{
			if(a[i] == k)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		i = middle + 1;
		for(; i < len; i++)
		{
			if(a[i] == k)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		return count;
	}
	public static int NumberOfK(int a[], int len, int k)
	{
		int start = 0,end = len-1;
		int middle = (start + end)/2;
		while(start <= end)
		{
			if(a[middle] == k)
			{
				return getNumber(middle, a, len, k);
				
			}
			else if(a[middle] < k)
			{
				start = middle + 1;
				middle = (start + end)/2;
			}
			else
			{
				end = middle - 1;
				middle = (start + end)/2;
			}
		}
		return 0;
	}
	
	

	public static void main(String[] args)
	{
		int[] a = {1,2,3,3,3,3,5,6};
		int count = NumberOfK(a,8,3);
		System.out.println(count);//4
		
		count = NumberOfK(a,8,5);//1
		System.out.println(count);
		
		count = NumberOfK(a,8,1);//1
		System.out.println(count);
		
		count = NumberOfK(a,8,6);//1
		System.out.println(count);
		
		count = NumberOfK(a,8,0);//0
		System.out.println(count);
		
		count = NumberOfK(a,8,7);//0
		System.out.println(count);
		
	}
	
	
}
