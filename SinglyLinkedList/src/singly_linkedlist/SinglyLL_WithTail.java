package singly_linkedlist;

import java.util.Scanner;

public class SinglyLL_WithTail {
	public Node head ;
	public Node tail ;
	public int sizeOfSLL;
	
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
	
	//UC2 -> add object in the firstIndex
	public void addFirstIndex() {
		//taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to add in SLL at First Index : ");
		int nodeInputData = myObjectValue.nextInt();
		
		//step1 : Create a new node
		Node newNode = new Node(nodeInputData);
		this.sizeOfSLL++;
	
		//checking LL is empty
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//step 2 : newNode.next is null; So we have replace the value with Head
		newNode.next = head;
		
		//step 3 : now head is newNode
		head = newNode;
		
	}
	
	//UC3 -> add object in the lastIndex
	public void addLastIndex() {
		//taking input from user
		Scanner myObjectValue = new Scanner(System.in);
		System.out.print("Enter number to add in SLL at Last Index : ");
		int nodeInputData = myObjectValue.nextInt();
		
		//step1 : Create a new node
		Node newNode = new Node(nodeInputData);
		this.sizeOfSLL++;
		
		//checking LL is empty
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//step 2 : tail.next is null; So we have replace the value with newNode
		tail.next= newNode;
		
		tail = newNode;
	}
	
	//UC4 -> print SLL with length 
	public void sizeOfSLL() {
		System.out.println("SLL length is : " + this.sizeOfSLL);
	}
}
