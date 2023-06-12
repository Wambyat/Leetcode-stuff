class Solution 
{
    public int longestMountain(int[] arr) 
    {
        boolean ever_fallen = false;
        boolean ever_risen = false;
        int len = 1;
        int max_len = 0;
        int raising = 1;
        int falling = 0;
        //2 states one when the mountain is raising. one when the mountain is falling. once either fails it reverts to raising.
        for(int i =0; i<arr.length-1; i++)
        {
            System.out.println("len: "+len);
            System.out.println("cur: "+arr[i]);
            if(raising == 1)
            {
                if(arr[i]<arr[i+1])
                {
                    ever_risen = true;
                    len = len + 1;
                    continue;
                }
                else if(arr[i]>arr[i+1] && len > 0)
                {
                    raising = 0;
                    falling = 1;
                    len = len + 1;
                    System.out.println("falling now ");
                    ever_fallen = true;
                    if(i == arr.length - 2)
                    {
                        if(arr[i]>arr[i+1])
                        {
                            System.out.println(":((((");
                            len = len + 1;
                            break;
                        }
                    }
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
                    System.out.println(":(");
                    len = len + 1;
                    if(i == arr.length - 2)
                    {
                        System.out.println(":((((");
                        if(arr[i]>arr[i+1])
                        {
                            len = len + 1;
                            break;
                        }
                    }
                }
                else
                {
                    len = len + 1;
                    if(max_len<len)
                    {
                        max_len = len;
                    }
                    System.out.println("remountain "+i);
                    System.out.println("len is "+len);
                    System.out.println("max len is "+max_len);
                    falling = 0;
                    raising = 1;
                    len = 1;
                }
            }  
        }

        if(max_len<len && falling == 1)
        {
            max_len = len;
        }

        if (ever_fallen == false || ever_risen == false)
        {
            return 0;
        }
        return max_len;
    }
}