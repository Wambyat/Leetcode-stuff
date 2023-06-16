import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 1; i>0; i++)
        {
            List<Integer> intList = IntStream.of(nums).boxed().collect(Collectors.toList());
            boolean check = intList.contains(i);
            //System.out.println("Value of i:"+i+" check: "+check);
            if (check == false)
            {
                return i;
            }
        }
        return 0;
    }
}