//given head, the head of a linked list, determine if the linked list has a cycle in it
package linkedlist;
public class LinkedListCycle {

    //nested ListNode class
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //test the hasCycle function
    public static void main(String[] args) {
        LinkedListCycle cycle = new LinkedListCycle();
        ListNode head = cycle.new ListNode(1);
        head.next = cycle.new ListNode(2);
        head.next.next = cycle.new ListNode(3);
        head.next.next.next = cycle.new ListNode(4);
        head.next.next.next.next = head.next.next;

        boolean cyclePresent = cycle.hasCycle(head);
        System.out.println(cyclePresent);
    }

    public boolean hasCycle(ListNode head){
        //initialise two pointers - fast and slow
        ListNode slow = head;
        ListNode fast = head;

        //until fast and fast.next are not null
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        if(fast == slow){
            return true;
        }
    }

        return false;
        //slow pointer moves one node at a time, fast pointer moves two nodes at a time
        //if fast pointer equals slow pointer, return true
        //otherwise return false
    }
}
