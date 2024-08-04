package singly_linkedlist;

public class SinglyLL_WithTail {
	public Node head ;
	public Node tail ;
	
	//print SLL with data 
	public void displayLL_Data() {
		// We can not change value i.e we take 'temp'
		Node temp = head;
		if (temp == null) {
			System.out.println("LL is empty.");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null" + "  <--&&&&-->  tail is :" + tail.data);
	}
	
	//print SLL with next  
	public void displayLL_Next() {
		// We can not change value i.e we take 'temp'
		Node temp = head;
		if (temp == null) {
			System.out.println("LL is empty.");
			return;
		}
		while (temp != null) {
			System.out.print(temp.next + " -> ");
			temp = temp.next;
		}
		System.out.println("null" + "  <--&&&&-->  tail is :" + tail.data);
	}
	
	
	//UC1 -> create a static SLL with 30, 43 , 54, 22
	public void createStaticSLL() {
		SinglyLL_WithTail singlyLL_WithTail = new SinglyLL_WithTail();
		singlyLL_WithTail.head = new Node(30);
		singlyLL_WithTail.tail = singlyLL_WithTail.head;
		singlyLL_WithTail.head.next = new Node(43);
		singlyLL_WithTail.tail = singlyLL_WithTail.head.next;
		singlyLL_WithTail.head.next.next = new Node(54);
		singlyLL_WithTail.tail = singlyLL_WithTail.head.next.next;
		singlyLL_WithTail.head.next.next.next = new Node(22);
		singlyLL_WithTail.tail = singlyLL_WithTail.head.next.next.next;
		
		singlyLL_WithTail.displayLL_Data();
		singlyLL_WithTail.displayLL_Next();
	}
}
