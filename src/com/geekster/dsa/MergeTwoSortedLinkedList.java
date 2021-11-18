package com.geekster.dsa;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLinkedList {

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
		
		ListNode head = n1;
		
		while(head != null)
		{
			if(head.val == 6)
			{
				ListNode newNode = new ListNode(10);
				ListNode temp = head.next;
				head.next = newNode;
				newNode.next = temp;
				break;
			}
			head = head.next;
		}
		
		while(n1 != null)
		{
			System.out.print(n1.val+" ");
			n1 = n1.next;
		}
	}
}
