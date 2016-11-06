


public class One{

    public static boolean binarySearch(int a[][], int i0, int in, int j0, int jn, int num)
    {
        boolean isvalid = (i0 <= in && i0 >= 0 && j0 <= jn && j0 >= 0);
        if(!isvalid)
        {
            return false;
        }
        
        if(j0 == jn)
        {
            while(i0 <= in)
            {
                int center = (i0+in)/2;
                int centerValue = a[center][j0];
                if(centerValue == num)
                {
                    return true;
                }
                if(num > centerValue)
                {
                    i0 = center + 1;
                }
                else
                {
                    in = center - 1;
                }
            }
        }
        if(i0 == in)
        {
            while(j0 <= jn)
            {
                int center = (j0+jn)/2;
                int centerValue = a[i0][center];
                if(centerValue == num)
                {
                    return true;
                }
                if(num > centerValue)
                {
                    j0 = center + 1;
                }
                else
                {
                    jn = center - 1;
                }
            }
        }
        return false;
    }
    public static boolean isInArray(int a[][], int i0, int in, int j0, int jn, int num)
    {
        boolean isvalid = (i0 <= in && i0 >= 0 && j0 <= jn && j0 >= 0);
        if(!isvalid)
        {
            return false;
        }
        int ic = (i0+in)/2;
        int jc = (j0+jn)/2;
        int centerValue = a[ic][jc];
        if(num == centerValue)
        {
            return true;
        }
        else if(num > centerValue)
        {
            if(binarySearch(a, ic, ic, jc+1, jn, num) == true)
            {
                return true;
            }
            if(binarySearch(a, ic+1, in, jc,jc,num) == true)
            {
                return true;
            }
            if(isInArray(a,ic+1,in,jc+1,jn,num) == true)
            {
                return true;
            }
            if(isInArray(a,ic+1,in,j0,jc-1,num) == true)
            {
                return true;
            }
            if(isInArray(a,i0,ic-1,jc+1,jn,num) == true)
            {
                return true;
            }
            
        }
        else
        {
            if(binarySearch(a, ic, ic, j0, jc-1, num) == true)
            {
                return true;
            }
            if(binarySearch(a, i0, ic-1, jc,jc,num) == true)
            {
                return true;
            }
            
            if(isInArray(a,i0,ic-1,j0,jc-1,num) == true)
            {
                return true;
            }
            if(isInArray(a,ic+1,in,j0,jc-1,num) == true)
            {
                return true;
            }
            if(isInArray(a,i0,ic-1,jc+1,jn,num) == true)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        int[][] a={{1,10,20,30},
                {12,13,23,33},
                {22,25,26,35},
                {32,38,40,50}};
//      int[][] a={{1,10},
//              {12,13}};
        boolean f = isInArray(a, 0, 3, 0, 3, 29);
        System.out.println(f);
        
    }

}
