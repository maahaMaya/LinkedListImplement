package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithoutTail;

public class ProgramWithoutTail {

	public static void main(String[] args) {
		SinglyLL_WithoutTail singlyLL_WithoutTail = new SinglyLL_WithoutTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : \n1: UC1 -> Static SLL. \n2: UC2 -> add firstIndex"
					+ "\n22: Print SLL Data. \n23: Print SLL Next.");
			Scanner myObjectValue = new Scanner(System.in);
			int option = myObjectValue.nextInt();
			switch(option) {
			case 1: 
				singlyLL_WithoutTail.createStaticSLL();
				break;
			case 2:
				singlyLL_WithoutTail.addFirstIndex();
				break;
			case 22:	
				singlyLL_WithoutTail.displayLL_Data();
				break;
			case 23:
				singlyLL_WithoutTail.displayLL_Next();
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
