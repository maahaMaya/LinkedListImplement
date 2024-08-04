package singly_linkedlist;


public class SinglyLL_WithoutTail {
	
	public Node head ;
	
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
		System.out.println("null");
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
		System.out.println("null");
	}
	
	
	//UC1 -> create a static SLL with 30, 43 , 54, 22
	public void createStaticSLL() {
		SinglyLL_WithoutTail singlyLL_WithoutTail = new SinglyLL_WithoutTail();
		singlyLL_WithoutTail.head = new Node(30);
		singlyLL_WithoutTail.head.next = new Node(43);
		singlyLL_WithoutTail.head.next.next = new Node(54);
		singlyLL_WithoutTail.head.next.next.next = new Node(22);
		
		singlyLL_WithoutTail.displayLL_Data();
		singlyLL_WithoutTail.displayLL_Next();
	}
	
}
