package linkedlist;

//
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//Example 1:
//
//Input: 1->1->2
//Output: 1->2
//Example 2:
//
//Input: 1->1->2->3->3
//Output: 1->2->3

public class LeetCode83 {
    //time O(n)
    //space O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                // remove the next node and keep comparing this node and its next node;
                temp.next = temp.next.next;
            }
            else

                temp = temp.next;
        }
        return head;
    }
}
