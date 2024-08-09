package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithTail;

public class ProgramWithTail {
	public static void main(String[] args) {
		SinglyLL_WithTail singlyLL_WithTail = new SinglyLL_WithTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : \n1: UC1 -> Static SLL. \n2: UC2 -> add firstObject"
					+ "\n3. UC3 -> add lastObject \n4: UC4 -> remove firstObject \n4: UC5 -> remove lastObject without Indexing"
					+ "\n6. UC6 -> add object when Value is matched"
					+ "\n22: Print SLL Data.  \n23: Print SLL Next. \n24. Print SLL length");
			Scanner myObjectValue = new Scanner(System.in);
			int option = myObjectValue.nextInt();
			switch (option) {
			case 1:
				singlyLL_WithTail.createStaticSLL();
				break;
			case 2:
				singlyLL_WithTail.addFirstObject();
				break;
			case 3:
				singlyLL_WithTail.addLastObject();
				break;
			case 4:
				singlyLL_WithTail.removeFirstObject();
				break;
			case 5:
				singlyLL_WithTail.removeLastObject();
				break;
			case 6:
				singlyLL_WithTail.addValueMatch();
				break;
			case 22:
				singlyLL_WithTail.displayLL_Data();
				break;
			case 23:
				singlyLL_WithTail.displayLL_Next();
				break;
			case 24:
				singlyLL_WithTail.sizeOfSLL();
				break;
			default:
				flag = false;
				System.out.println("THANKYOU!!!!");
				break;
			}
		}
		singlyLL_WithTail.createStaticSLL();
	}
}
