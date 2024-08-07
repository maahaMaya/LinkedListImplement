package singly_linkedlist;

import java.util.Scanner;

public class SinglyLL_WithoutTail {
	
	public Node head ;
	
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
			head = newNode;
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
			head = newNode;
			return;
		}
		
		Node temp = head;
		// for getting last index
		while(temp.next != null) {
			temp = temp.next;
		}
		
		System.out.println(temp.data);
		//step 2 : temp.next is null; So we have replace the value with newNode
		temp.next= newNode;
	}
	
	//UC4 -> print SLL with length 
	public void sizeOfSLL() {
		System.out.println("SLL length is : " + this.sizeOfSLL);
	}
	
}
