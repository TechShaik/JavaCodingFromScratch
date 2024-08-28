 package com.JavaCodingFromScratch;

public class DL_AddAtBegining {
	  
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
			n.next = head;
			head = n;
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
		DL_AddAtBegining d = new DL_AddAtBegining();
		d.insert(2);
		d.insert(20);
		d.insert(200);
		d.insert(2000);
		System.out.println();
		d.disp();
	}
}
