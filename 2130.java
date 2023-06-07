class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i = 0;head!= null; i++)
        {
            li.add(head.val);
            head = head.next;
        }
        
        List<Integer> firstHalf = li.subList(0, li.size() / 2);
        List<Integer> secondHalf = li.subList(li.size() / 2, li.size());
        Collections.reverse(secondHalf);

        int max = 0;
        int temp = 0;
        for (int i = 0;i<firstHalf.size();i++)
        {
            temp = firstHalf.get(i) + secondHalf.get(i);
            if (temp>max)
            {
                max = temp;
            }
        }

        return max;
    }
}
