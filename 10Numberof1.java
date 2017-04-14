package org.gll.classloading;

public class Hello {
	
	public int getNumOne(int n)
	{
		int c = 0;
		while(n > 0)
		{
			if(n % 2 == 1)
			{
				c++;
			}
			n = n / 2;
		}
		return c;
	}
	
	public int getNumOne2(int n)
	{
		int c = 0;
		int temp = 1;
		while(temp > 0)
		{
			int flag = n & temp;
			if(flag > 0)
			{
				c++;
			}
			temp = temp << 1;
		}
		return c;
	}
	//把一个整数减去1之后再和原来的整数做位与运算，得到的结果相当于是把整数的二进制表示中的最右边一个1变成0，很多二进制的问题都可以用这个思路解决。
	public static void main(String[] args) {
		Hello hello = new Hello(); 
		System.out.println(hello.getNumOne(0));
		System.out.println(hello.getNumOne2(0));
	}

}
