class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();   
        ListNode temp = new ListNode();

        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        
        if (list1.val ==  list2.val)
        {
            head = list1;
            temp = list1.next;
            list1.next = list2;
            list1 = temp;
            list2 = list2.next;
            temp = head.next;
        }

        else if(list1.val > list2.val)
        {
            head = list2;
            list2 = list2.next;
            temp = head;
        }

        else
        {
            head = list1;
            list1 = list1.next;
            temp = head;
        }

        while(true)
        {
            if(list1 == null)
            {
                temp.next = list2;
                break;
            }
            else if(list2 == null)
            {
                temp.next = list1;
                break;
            }
            System.out.println("temp: "+temp.val);
            System.out.println("list1: "+list1.val);
            System.out.println("list2: "+list2.val);
            if(list1.val > list2.val)
            {
                System.out.println("list 1 greater");
                temp.next = list2;
                list2 = list2.next;
            }
            else if(list1.val <= list2.val)
            {
                System.out.println("list 2 greater");
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
            System.out.println("loop another");
        }
        return head;
   }
}