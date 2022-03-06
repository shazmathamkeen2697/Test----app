package com;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double a;
	      double b;
	      double result;
	      char op;
	      Scanner reader  = new Scanner(System.in);
	      System.out.println("Enter  numbers: ");
	      a = reader.nextDouble();
	      b = reader.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': result = a + b;
	            break;
	         case '-': result = a - b;
	            break;
	         case '*': result = a * b;
	            break;
	         case '/': result = a / b;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(a + " " + op + " " + b + " = " + result);
	   }
	}


