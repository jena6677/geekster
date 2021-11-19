package com.geekster;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeSmallToLarge {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(7);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		
		n4.next = n5;
		n5.next = n6;
		
		ListNode head1 = n1;
		ListNode head2 = n4;
		ListNode prev1 = null;
		ListNode prev2 = null;
		int count1 = 0, count2 = 0;
		while(head1!=null)
		{
			prev1 = head1;
			head1 = head1.next;
			count1++;
		}
		while(head2!=null)
		{
			prev2 = head2;
			head2 = head2.next;
			count2++;
		}
		if(count1>count2)
		{
			prev1.next = n4;
			
		}
		else
		{
			prev2.next = n1;
		}
	}
}
