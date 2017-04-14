package org.gll.classloading;

public class Hello {
	public int getFibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		return getFibonacci(n-1)+getFibonacci(n-2);
	}
	
	public int getFibonacci2(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		int bn = 1;
		int bbn = 0;
		for(int i = 2; i <= n; i++)
		{
			int temp = bn;
			bn = bn + bbn;
			bbn = temp;
		}
		return bn;
	}
	//一开始想着用map存，或者是concurentHashMap和futureTask
	//不需要用到这些，这些是并发考虑的事情，而且这边是简单的计算
	//类似题目：青蛙跳级，矩形覆盖
	public static void main(String[] args) {
		Hello hello = new Hello(); 
		System.out.println(hello.getFibonacci(8));
		System.out.println(hello.getFibonacci2(8));
	}

}
