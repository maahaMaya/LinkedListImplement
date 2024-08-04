package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithoutTail;

public class ProgramWithoutTail {

	public static void main(String[] args) {
		SinglyLL_WithoutTail singlyLL_WithoutTail = new SinglyLL_WithoutTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : 1.UC1 -> Static SLL");
			Scanner myObj = new Scanner(System.in);
			int option = myObj.nextInt();
			switch(option) {
			case 1: 
				singlyLL_WithoutTail.createStaticSLL();
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
