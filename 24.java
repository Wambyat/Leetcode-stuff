class Solution {
    
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = head;
        ListNode temp_curr = head;
        ListNode temp_ahead = head.next;        

        while (temp_ahead != null)
        {
            temp_curr.next = temp_ahead;
            temp_ahead = temp_ahead.next;
            temp_curr.next.next = temp;
            temp_curr = temp_curr.next.next;
            temp = temp_curr;
        }

        return head;
    }
}