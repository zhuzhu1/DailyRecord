


public class One{
	public static boolean isInArray2(int a[][], int m, int n, int num)
	{
		int i = 0, j = n-1;
		while(i < m && j >= 0)
		{
			if(num == a[i][j])
			{
				return true;
			}
			else if(num > a[i][j])
			{
				i = i + 1;
			}
			else
			{
				j = j - 1;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		int[][] a={{1,10,20,30},
				{12,13,23,33},
				{22,25,26,35},
				{32,38,40,50}};

		//测试用例要覆盖全尽量多的场景
		boolean f = isInArray2(a, 4, 4, 22);
		System.out.println(f);
		f = isInArray2(a, 4, 4, 50);
		System.out.println(f);
	    f = isInArray2(a, 4, 4, 1);
		System.out.println(f);
		f = isInArray2(a, 4, 4, 0);
		System.out.println(f);
		f = isInArray2(a, 4, 4, 55);
		System.out.println(f);
		f = isInArray2(a, 4, 4, 27);
		System.out.println(f);
		
	}

}
