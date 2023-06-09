class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        int size_concat = 0;

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length; j++)
            {
                if(i!=j)
                {
                    size_concat = nums[i].length()+nums[j].length();
                    if (size_concat!=target.length())
                    {
                        continue;
                    }

                    if(nums[i].concat(nums[j]).equals(target))
                    {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}