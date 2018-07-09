package linkedlist;

public class LeetCode21 {
//    Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
//Example:
//
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        ListNode dummy = new ListNode(0);
//        ListNode res = dummy;
//        while(l1 != null && l2 != null){
//            if(l1.val < l2.val){
//                dummy.next = l1;
//                l1 = l1.next;
//            }
//            else{
//                dummy.next = l2;
//                l2 = l2.next;
//            }
//            dummy = dummy.next;
//        }
//        if(l1 != null)
//            dummy.next = l1;
//        else
//            dummy.next = l2;
//        return res.next;

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }


    }
}
