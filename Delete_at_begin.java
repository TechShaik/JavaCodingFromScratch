 package com.JavaCodingFromScratch;

 
public class Delete_at_begin {
	  
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
	 
	public void delete(){
       if(head!=tail) {
    	   head=head.next;
       }else {
    	   head=tail=null;
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
		Delete_at_begin d = new Delete_at_begin();
		d.insert(2);
		d.insert(20);
		d.insert(200);
		d.insert(2000);
 		d.disp();
 		System.out.println();
 		d.delete();
 		d.disp();
 		
	}
}
