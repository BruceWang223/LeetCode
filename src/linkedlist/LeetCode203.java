package linkedlist;

public class LeetCode203 {
//    Remove all elements from a linked list of integers that have value val.
//
//Example:
//
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5
    public ListNode removeElements(ListNode head, int val) {


        //my solution to get the first element not equal to val;
/*
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode temp = head;
        ListNode res = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }
        return res;
*/

// there is actually a better way to achieve this by adding a node before the head listnode;

        if(head == null) return null;
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode dummy = p;
        while(dummy.next != null){
            if(dummy.next.val == val){
                dummy.next = dummy.next.next;
            }
            else
                dummy = dummy.next;
        }
        return p.next;
    }
}
