package singly_linkedlist;

import java.util.Scanner;

public class SinglyLL_WithTail {
	public Node head;
	public Node tail;
	public int sizeOfSLL;

	// print SLL with data
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

	// print SLL with next
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

	// UC1 -> create a static SLL with 30, 43 , 54, 22
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

	// UC2 -> add object from the firstIndex
	public void addFirstObject() {
		// taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to add in SLL at First Index : ");
		int nodeInputData = myObjectValue.nextInt();

		// step1 : Create a new node
		Node newNode = new Node(nodeInputData);
		this.sizeOfSLL++;

		// checking LL is empty
		if (head == null) {
			head = tail = newNode;
			return;
		}

		// step 2 : newNode.next is null; So we have replace the value with Head
		newNode.next = head;

		// step 3 : now head is newNode
		head = newNode;

	}

	// UC3 -> add object from the lastIndex
	public void addLastObject() {
		// taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to add in SLL at Last Index : ");
		int nodeInputData = myObjectValue.nextInt();

		// step1 : Create a new node
		Node newNode = new Node(nodeInputData);
		this.sizeOfSLL++;

		// checking LL is empty
		if (head == null) {
			this.head = this.tail = newNode;
			return;
		}

		// step 2 : tail.next is null; So we have replace the value with newNode
		tail.next = newNode;

		tail = newNode;
	}

	// UC4 -> print SLL with length
	public void sizeOfSLL() {
		System.out.println("SLL length is : " + this.sizeOfSLL);
	}

	// UC5 -> remove object from the firstIndex without Indexing
	public void removeFirstObject() {
		// check for the empty SLL
		if (this.head == null) {
			System.out.println("SLL is empty.So, we can not remove an Object");
			return;
		}
		if (this.head.next == null) {
			this.head = this.tail = this.head.next;
			this.sizeOfSLL--;
			return;
		}
		// swap head object
		this.sizeOfSLL--;
		this.head = this.head.next;
	}

	// UC6 -> remove object from the lastIndex without Indexing
	public void removeLastObject() {
		// check for the empty SLL
		if (this.head == null) {
			System.out.println("SLL is empty.So, we can not remove an Object");
			return;
		}
		// check for the head of SLL
		else if (this.head.next == null) {
			this.head = this.tail = null;
			this.sizeOfSLL--;
			return;
		}

		Node temp = head;
		Node prev = head;
		// search tail and remove
		while (temp.next.next != null) {
			temp = temp.next;
			prev = temp;
		}
		tail = prev;
		prev.next = null;
		this.sizeOfSLL--;
		System.out.println("Last Object removed from SLL Successfully");
	}

	// UC7 -> add object when value matches
	public void addValueMatch() {
		// taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to add in SLL when Value matched : ");

		int matchInputData = myObjectValue.nextInt();
		Node temp = head;
		while (temp.data != matchInputData) {
			temp = temp.next;
		}

		if (temp.data == matchInputData) {
			System.out.print("Since Value is matched -> Enter number to add in SLL : ");
			int nodeInputData = myObjectValue.nextInt();
			Node newNode = new Node(nodeInputData);
			newNode.next = temp.next;
			temp.next = newNode;
			this.sizeOfSLL++;
			return;
		}

		System.out.print("Value is not present in SLL.");
	}

	// UC8 -> remove object when value matches
	public void removeValueMatched() {
		// taking input from user for finding value
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to remove in SLL when Value matched : ");
		int matchInputData = myObjectValue.nextInt();
		if (head.next == null && this.head.data == matchInputData) {
			this.removeFirstObject();
			return;
		} else if (this.head.data == matchInputData) {
			this.removeFirstObject();
			return;
		}

		Node temp = this.head;
		Node prev = null;
		while (temp.data != matchInputData && temp.next != null) {
			prev = temp;
			temp = temp.next;
		}

		if (temp.data == matchInputData && temp.next == null) {
			this.removeLastObject();
			return;
		} else if (temp.data == matchInputData) {
			prev.next = temp.next;
			temp = null;
			this.sizeOfSLL--;
			System.out.println("Removed from SLL Successfully : " + matchInputData);
			return;
		}

		System.out.print("Value is not present in SLL.");
	}

	// UC9 -> add object at Index
	public void addValueIndex() {
		// taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter index to add in SLL: ");

		int indexInputData = myObjectValue.nextInt();

		System.out.print("Enter number to add in SLL : ");
		int nodeInputData = myObjectValue.nextInt();
		Node newNode = new Node(nodeInputData);

		int i = 0;
		Node temp = head;
		while (i < indexInputData - 1) {
			temp = temp.next;
			i++;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		this.sizeOfSLL++;
		return;
	}

	// UC10 -> iterative Search
	public void iterativesearch() {
		// taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter value to search in SLL: ");
		int indexInputData = myObjectValue.nextInt();

		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (temp.data == indexInputData)
				System.out.println("Value found at index : " + i);
			temp = temp.next;
			i++;
		}
		System.out.println("Value not found at the index");

	}
}
