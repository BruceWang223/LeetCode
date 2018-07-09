package linkedlist;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
      this.val = x;
      this.next = null;
  }
}

public class LeetCode141 {

//    Given a linked list, determine if it has a cycle in it.
//
//Follow up:
//Can you solve it without using extra space?

    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode runner = head, walker = head;
        while (runner.next != null && runner.next.next != null){
            runner = runner.next.next;
            walker = walker.next;
            if(runner == walker) return true;
        }
        return false;
    }
}
