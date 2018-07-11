package linkedlist;

public class LeetCode24 {

//    Given a linked list, swap every two adjacent nodes and return its head.
//
//Example:
//
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//Note:
//
//Your algorithm should use only constant extra space.
//You may not modify the values in the list's nodes, only nodes itself may be changed.

    //time O(n)
    //space O(1)
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        ListNode temp;
        while (head != null && head.next != null){
            temp = head;
            head = head.next.next;
            dummy.next = temp.next;
            temp.next = null;
            dummy.next.next = temp;
            temp.next = head;
            dummy = dummy.next.next;
        }
        return res.next;
    }

    public static void main(String[]args){

    }
}
