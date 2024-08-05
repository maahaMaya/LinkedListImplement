package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithTail;

public class ProgramWithTail {
	public static void main(String[] args) {
		SinglyLL_WithTail singlyLL_WithTail = new SinglyLL_WithTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : \n1: UC1 -> Static SLL. \n2: UC2 -> add firstIndex"
					+ "\n22: Print SLL Data. \n23: Print SLL Next.");
			Scanner myObjectValue = new Scanner(System.in);
			int option = myObjectValue.nextInt();
			switch(option) {
			case 1: 
				singlyLL_WithTail.createStaticSLL();
				break;
			case 2:
				singlyLL_WithTail.addFirstIndex();
				break;
			case 22:	
				singlyLL_WithTail.displayLL_Data();
				break;
			case 23:
				singlyLL_WithTail.displayLL_Next();
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
