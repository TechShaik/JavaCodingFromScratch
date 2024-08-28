package com.JavaCodingFromScratch;

public class Double_Linked_list
      {
	   class Node
	   {
		   int data;
		   Node next;
		   Node prev;
		   
		   public Node(int data) 
		   {
			   this.data=data;
			   next=prev=null;
		   }
	   }
	   Node head=null;
	   Node tail=null;
	   
	   public void insert(int data) {
		   Node n=new Node(data);
		   if(head==null) {
			   head=tail=n;
		   }
		   else
		   {
			   tail.next=n;          // here is the condition for double linked list
			   n.prev=tail;
			   tail=n;
			   tail.next=null;
		   }
	   }
	   
	   public void disp() {
		   Node curr=head;
		   if(head==null) {
			   System.out.println("List is empty");
		   }
		   else {
			   while(curr!=null) {
				   System.out.println(curr.data);
				   curr=curr.next;
		   }
		   }
	   }
	  
	public static void main(String[] args) {
		Double_Linked_list d=new Double_Linked_list();
		d.disp();
  		d.insert(1);
		d.insert(11);
		d.insert(111);
		d.insert(1111);
 		d.disp();
 		System.out.println();
 		d.insert(111111);
 		d.disp();

	}

}
