
public class One{
	//要求：在原来的字符串上做替换，并且保证输入的字符串后面有足够多的空闲内存。
	public static void replaceSpace(char[] str, int len)
	{
		if(str == null || len <= 0)
		{
			return;
		}
		int spaceCount = 0;
		for(int i = 0; i < len; i++)
		{
			if(str[i] == ' ')
			{
				spaceCount++;
			}
		}
		int shift = spaceCount*2;
		for(int i = len-1; i >= 0; i--)
		{
			if(str[i] == ' ')
			{
				str[i+shift] = '0';
				str[i+shift-1] ='2';
				str[i+shift-2] = '%';
				shift = shift - 2;
			}
			else
			{
				str[i+shift] = str[i];
			}
		}
	}
	public static void main(String[] args) {
		//调用java string api
		String text= "We are happy.";
		String result = text.replace(" ","%20");
		System.out.println(text);
		System.out.println(result);
		
		
		//要求：在原来的字符串上做替换，并且保证输入的字符串后面有足够多的空闲内存。
		char[] text2 = new char[100];
		text2[0] = 'W';
		text2[1] = 'e';
		text2[2] = ' ';
		text2[3] = 'a';
		text2[4] = 'r';
		text2[5] = 'e';
		text2[6] = ' ';
		text2[7] = 'h';
		for(int i = 0; i < 8;i++)
		{
			System.out.print(text2[i]);
		}
		replaceSpace(text2,8);
		System.out.println();
		for(int i = 0; i < 12;i++)
		{
			System.out.print(text2[i]);
		}
		System.out.println();
		//
		char[] text3 = new char[100];
		text3[0] = ' ';
		text3[1] = ' ';
		text3[2] = ' ';
		for(int i = 0; i < 3;i++)
		{
			System.out.print(text3[i]);
		}
		replaceSpace(text3,3);
		System.out.println();
		for(int i = 0; i < 9;i++)
		{
			System.out.print(text3[i]);
		}
	}

}
