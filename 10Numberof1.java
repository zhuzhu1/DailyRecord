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
	//��һ��������ȥ1֮���ٺ�ԭ����������λ�����㣬�õ��Ľ���൱���ǰ������Ķ����Ʊ�ʾ�е����ұ�һ��1���0���ܶ�����Ƶ����ⶼ���������˼·�����
	public static void main(String[] args) {
		Hello hello = new Hello(); 
		System.out.println(hello.getNumOne(0));
		System.out.println(hello.getNumOne2(0));
	}

}
