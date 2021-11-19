package com.geekster;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class KthElementFromEnd {

	public static void main(String[] args) {
		
		int nth = 3;
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
		
		//two time traverse
		ListNode head = n1;
		ListNode n = n1;
		int count = 0;
		
		while(n != null)
		{
			count++;
			n = n.next;
		}
		
		count = count - nth;
		for(int i = 0; i < count; i++)
		{
			head = head.next;
		}
		System.out.println(head.val);
		
		//double pointer
		ListNode slow = n1;
		ListNode fast = n1;
		
		for(int i = 0; i < nth; i++)
		{
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(slow.val);
	}
}
