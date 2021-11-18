package com.geekster.dsa;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class CheckLoopInLinkedList {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(7);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n2;
		
		ListNode head1 = n1;
		ListNode head2 = n1.next;
		
		while(head1 != null)
		{
			if(head1.val == head2.val)
			{
				System.out.println("loop found");
				break;
			}
			head1 = head1.next;
			head2 = head2.next.next;
		}
		
	}
}
