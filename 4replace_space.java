


public class One{
	public static String replaceSpace(String str)
	{
		if(str == null)
		{
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				sb.append("%20");
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String text= "We are happy.";
		String result = replaceSpace(text);
		System.out.println(result);
		
		text= null;
		result = replaceSpace(text);
		System.out.println(result);
		
		text= "";
		result = replaceSpace(text);
		System.out.println(result);
		
		text= "  qq  ";
		result = replaceSpace(text);
		System.out.println(result);
	}

}
