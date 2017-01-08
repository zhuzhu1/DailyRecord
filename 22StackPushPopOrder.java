package org.fenixsoft.clazz;

import java.util.Stack;

public class TestClass {
	private static Stack<Integer> stack = new Stack<>();

	public static boolean StackPushPopOrder(int a[], int lena, int result[], int lenr)
	{
		if(lena != lenr)
		{
			return false;
		}
		
		int i = 0, j = 0;
		while(i < lena)
		{
			if(j < lena && a[j] == result[i])
			{
				i++;
				j++;
			}
			else if(!stack.isEmpty() && stack.peek() == result[i])
			{
				stack.pop();
				i++;
			}
			else
			{
				if(j < lena)
				{
					stack.push(a[j]);
					j++;
				}
				else
				{
					return false;
				}
			}
		}
		
		
		return true;
	}

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int[] r={4,5,3,2,1};
		boolean b = StackPushPopOrder(a,5,r,5);
		System.out.println(b);
		int[] r2={4,3,5,1,2};
		b = StackPushPopOrder(a,5,r2,5);
		System.out.println(b);
		
		int[] a3={1};
		int[] r3={4};
		b = StackPushPopOrder(a3,1,r3,1);
		System.out.println(b);
		
		int[] r4={1};
		b = StackPushPopOrder(a3,1,r4,1);
		System.out.println(b);
		
		
	}
	
	
}
