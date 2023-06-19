class Solution 
{
    public ListNode swapPairs(ListNode head) 
    {
        if (head == null || head.next == null) 
        {
            return head;
        }

        ListNode curr = head;
        ListNode temp = head;
        ListNode temp_ahead = head.next;

        // First swap done outside the loop
        curr.next = temp_ahead.next;
        temp_ahead.next = curr;
        head = temp_ahead;
        temp_ahead = curr.next;
        curr = temp_ahead;
        temp = curr;

        if (curr.next == null) 
        {
            return head;
        }
        temp_ahead = temp_ahead.next;

        while (temp_ahead != null) 
        {

        }

        return head;
    }
}