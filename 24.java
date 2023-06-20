class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode temp = head;
        ListNode temp_ahead = head.next;

        // First swap done outside the loop
        curr.next = temp_ahead.next;
        curr = temp_ahead;
        curr.next = temp;
        head = curr;
        curr = curr.next;

        if (curr.next == null) {
            return head;
        }

        temp = curr.next;

        if (temp.next == null) {
            return head;
        }

        temp_ahead = temp.next;

        while (temp_ahead != null) {
            curr.next = temp_ahead;
            temp.next = temp_ahead.next;
            temp_ahead.next = temp;
            curr = temp;
            if (curr.next == null) {
                break;
            }
            temp = temp.next;
            if (temp.next == null) {
                break;
            }
            temp_ahead = temp.next;
        }

        return head;
    }
}