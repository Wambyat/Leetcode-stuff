import javax.lang.model.util.ElementScanner6;

class Solution 
{
    public int longestMountain(int[] arr) 
    {
        int len = 0;
        int max_len = 0;
        int raising = 1;
        int falling = 0;
        //2 states one when the mountain is raising. one when the mountain is falling. once either fails it reverts to raising.
        for(int i =0; i<arr.length-1; i++)
        {
            if(raising == 1)
            {
                if(arr[i]>arr[i+1])
                {
                    len++;
                    continue;
                }
                else if(arr[i]<arr[i+1])
                {
                    raising = 0;
                    falling = 1;
                    len++;
                    continue;
                }
                else
                {
                    len = 0;
                    raising = 1;
                    continue;
                }
            }

            if(falling == 1)
            {
                if(arr[i]>arr[i+1])
                {
                    len++;
                }
                else
                {
                    if(max_len<len)
                    {
                        max_len = len;
                    }
                    falling = 0;
                    raising = 1;
                    len = 0;
                }
            }  
        }
        if(max_len<len)
        {
            max_len = len;
        }
        return max_len;
    }
}