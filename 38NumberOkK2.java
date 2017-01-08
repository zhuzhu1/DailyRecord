package org.fenixsoft.clazz;


public class TestClass {

	public static int getFirstK(int middle, int a[], int len, int k)
	{
		int start = 0, end = middle-1;
		int md = (start+end)/2;
		while(start <= end)
		{
			if(a[md] == k)
			{
				if((md > 0 && a[md-1] != k)|| md == 0)
				{
					return md;
				}
				else
				{
					end = md - 1;
					md = (start + end)/2;
				}
				
			}
			else if(a[md] < k)
			{
				start = md + 1;
				md = (start + end)/2;
			}
			else
			{
				end = md - 1;
				md = (start + end)/2;
			}
		}
		return -1;
	}
	
	public static int getLastK(int middle, int a[], int len, int k)
	{
		int start = middle+1, end = len-1;
		int md = (start+end)/2;
		while(start <= end)
		{
			if(a[md] == k)
			{
				if((md <len-1 && a[md+1] != k)|| md == len-1)
				{
					return md;
				}
				else
				{
					start = md + 1;
					md = (start + end)/2;
				}
				
			}
			else if(a[md] < k)
			{
				start = md + 1;
				md = (start + end)/2;
			}
			else
			{
				end = md - 1;
				md = (start + end)/2;
			}
		}
		return -1;
	}
	public static int NumberOfK(int a[], int len, int k)
	{
		int start = 0,end = len-1;
		int middle = (start + end)/2;
		while(start <= end)
		{
			if(a[middle] == k)
			{
				//获取第一个和最后一个K
				int firstK = getFirstK(middle,a,len,k);
				int lastK = getLastK(middle,a,len,k);
				if(firstK == -1)
				{
					firstK = middle;
				}
				if(lastK == -1)
				{
					lastK = middle;
				}
				return lastK - firstK + 1;
				
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
