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
	//һ��ʼ������map�棬������concurentHashMap��futureTask
	//����Ҫ�õ���Щ����Щ�ǲ������ǵ����飬��������Ǽ򵥵ļ���
	//������Ŀ���������������θ���
	public static void main(String[] args) {
		Hello hello = new Hello(); 
		System.out.println(hello.getFibonacci(8));
		System.out.println(hello.getFibonacci2(8));
	}

}
