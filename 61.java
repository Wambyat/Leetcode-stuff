// !TODO actually solve this problem
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        for(int i = 0;i < k; i++)
        {
            temp.next.next = head;
            head = temp.next;
            temp.next = null;
        }   
        return head;     
    }
}