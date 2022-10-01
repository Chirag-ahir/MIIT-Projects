package com.miit.calculator;

import java.util.Scanner;

public class CalculatorMain {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		CalculatorFunction can = new CalculatorFunction();

		while(true) {
			Scanner cc = new Scanner(System.in);
			System.out.print("Enter a first number: ");
			int num1 = cc.nextInt();
			System.out.print("Enter a second number: ");
			int num2 = cc.nextInt();
			
			System.out.print("Choose a operator from + - / * : ");
			String op = cc.next();
			
			int total =0; 
			
			switch(op) {
				case "+":
					total = can.add(num1, num2);
					break;
				case "-":
					total = can.sub(num1, num2);
					break;
				case "/":
					total = can.div(num1, num2);
					break;
				case "*":
					total = can.mul(num1, num2);
					break;
				default:
					System.out.println("Please choose a correct operator.");
			}
			
			System.out.println(total);
			
		}

	}
}
