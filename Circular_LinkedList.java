 package com.JavaCodingFromScratch;

public class Circular_LinkedList {
	  
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;
	 
	public void insert(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			 tail=n;
			 tail.next=head;              // This is the point where linked list become circular Linked list
		}
	}
	
	public void disp() {
		Node curr = head;
		if (head == null) {
			System.out.println("Linked-List is empty");
		} else {
			while (curr != null) {
				System.out.println(curr.data);  // Removed unnecessary '+'
				curr = curr.next;  // Move to the next node
			}
		}
	}
	
	public static void main(String[] args) {
		DL_AddAtEnd d = new DL_AddAtEnd();
		d.insert(2);
		d.insert(20);
		d.insert(200);
		d.insert(2050);
		System.out.println();
		d.disp();
	}
}
