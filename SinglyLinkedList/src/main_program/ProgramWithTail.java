package main_program;

import java.util.Scanner;

import singly_linkedlist.SinglyLL_WithTail;

public class ProgramWithTail {
	public static void main(String[] args) {
		SinglyLL_WithTail singlyLL_WithTail = new SinglyLL_WithTail();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter an option : \n 1.UC1 -> Static SLL");
			Scanner myObj = new Scanner(System.in);
			int option = myObj.nextInt();
			switch(option) {
			case 1: 
				singlyLL_WithTail.createStaticSLL();
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
