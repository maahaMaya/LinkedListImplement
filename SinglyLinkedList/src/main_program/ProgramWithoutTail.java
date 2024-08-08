package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithoutTail;

public class ProgramWithoutTail {

	public static void main(String[] args) {
		SinglyLL_WithoutTail singlyLL_WithoutTail = new SinglyLL_WithoutTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : \n1: UC1 -> Static SLL. \n2: UC2 -> add firstObject"
					+ "\n3. UC3 -> add lastObject \n4: UC4 -> remove firstObject \n4: UC5 -> remove lastObject without Indexing"
					+ "\n22: Print SLL Data.  \n23: Print SLL Next. \n24. Print SLL length");
			Scanner myObjectValue = new Scanner(System.in);
			int option = myObjectValue.nextInt();
			switch(option) {
			case 1: 
				singlyLL_WithoutTail.createStaticSLL();
				break;
			case 2:
				singlyLL_WithoutTail.addFirstObject();
				break;
			case 3:
				singlyLL_WithoutTail.addLastObject();
				break;
			case 4:
				singlyLL_WithoutTail.removeFirstObject();
				break;
			case 5:
				singlyLL_WithoutTail.removeLastObject();
				break;
			case 22:	
				singlyLL_WithoutTail.displayLL_Data();
				break;
			case 23:
				singlyLL_WithoutTail.displayLL_Next();
				break;
			case 24:
				singlyLL_WithoutTail.sizeOfSLL();
				break;
			default:
				flag = false;
				System.out.println("THANKYOU!!!!");
				break;
			} 
		}
		singlyLL_WithoutTail.createStaticSLL();
	}
}
