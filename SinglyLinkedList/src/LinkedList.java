
public class LinkedList {

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;

	// print LinkedList with data value 
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
		System.out.println("null" + "  <--and-->  tail is :" + tail.data);
	}
	
	// print LinkedList with next value 
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
		System.out.println("null" + "  <--and-->  tail is :" + tail.next);
	}

	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();

		l1.head = new Node(56);
		l1.tail = l1.head;
		l1.displayLL_Data();

		l1.head.next = new Node(30);
		l1.tail = l1.head.next;
		l1.displayLL_Data();

		l1.head.next.next = new Node(70);
		l1.tail = l1.head.next.next;
		l1.displayLL_Data();

		l1.head.next.next.next = new Node(34);
		l1.tail = l1.head.next.next.next;
		l1.displayLL_Data();

		l1.displayLL_Next();
	}

}
