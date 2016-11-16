
public class One{
	
	public static int getMinValue(int[] arr, int n)
	{
		int i = 0, j = n-1,m = (i+j)/2;
		while(i <= j)
		{
			if(arr[i] < arr[j])
			{
				return arr[i];
			}
			if(i + 1 == j)
			{
				return arr[j];
			}
			if(arr[m] == arr[i])
			{
				int p = m;
				while(p > i)
				{
					if(arr[p] == arr[i])
					{
						p--;
					}
					else
					{
						break;
					}
				}
				if(p == i)
				{
					i = m + 1;
					m = (i + j) / 2;
				}
				else
				{
					j = m;
					m = (i + j) / 2;
				}
			}
			else if(arr[m] > arr[i])
			{
				i = m + 1;
				m = (i + j) / 2;
			}
			else// if(arr[m] < arr[j])
			{
				j = m;
				m = (i + j) / 2;
			}
			
		}
		return arr[i];
	}
	public static void main(String[] args) {
//		int[] arr= {1,1,1,1,2,3,4,4,4,4,5,6,7,8,9,10};
//		int[] arr= {5,6,7,8,9,9,9,9,10,1,1,1,2,3,3,3,3,4,4,4,4};
//		int[] arr= {1,0,1,1,1};
//		int[] arr= {1,1,1,0,1};
		int[] arr= {1,1,1,1,1};
		int r = getMinValue(arr,arr.length);
		System.out.println(r);
	}

}
