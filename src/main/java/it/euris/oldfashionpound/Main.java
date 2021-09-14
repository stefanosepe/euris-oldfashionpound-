package it.euris.oldfashionpound;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//String pounds = args[0];
		//String shillings = args[1];
		//String pennies = args[2];
		//OldPound a = new OldPound(Integer.decode(pounds), Integer.decode(shillings), Integer.decode(pennies));
		OldPoundCalculator calc = new OldPoundCalculator();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("-------------------------------------");
				System.out.println("   chose an operation: +, -, *, /   ");
				String line = scanner.nextLine();
				OldPound OldPound_1;
				OldPound OldPound_2;
				String number;
				switch(line) {
				case "+": 
					System.out.println("insert oldPound 1: ");
					OldPound_1 = getOldPoundFromPrompt(scanner);
					System.out.println("insert oldPound 2: ");
					OldPound_2 = getOldPoundFromPrompt(scanner);
					System.out.println("result = : "+ calc.sum(OldPound_1, OldPound_2) );
					break;
				case "-": 
					System.out.println("insert oldPound 1: ");
					OldPound_1 = getOldPoundFromPrompt(scanner);
					System.out.println("insert oldPound 2: ");
					OldPound_2 = getOldPoundFromPrompt(scanner);
					System.out.println("result = : "+ calc.subtraction(OldPound_1, OldPound_2) );
					break;
				case "*": 
					System.out.println("insert oldPound 1: ");
					OldPound_1 = getOldPoundFromPrompt(scanner);
					System.out.println("insert int number: ");
					number = scanner.nextLine();
					System.out.println("result = : "+ calc.multiplication(OldPound_1, Integer.decode(number)) );
					break;
				case "/": 
					System.out.println("insert oldPound 1: ");
					OldPound_1 = getOldPoundFromPrompt(scanner);
					System.out.println("insert int number: ");
					number = scanner.nextLine();
					System.out.println("result = : "+ calc.division(OldPound_1, Integer.decode(number)) );
					break;
				default :
					System.out.println("Invalid Operation. select one of that: +, -, *, / ");
				}


			}
		} catch(IllegalStateException | NoSuchElementException e) {
			// System.in has been closed
			System.out.println("System.in was closed; exiting");
		}

	}

	private static OldPound getOldPoundFromPrompt(Scanner scanner) {
		System.out.println("insert oldPound pounds: ");
		String pounds = scanner.nextLine();
		System.out.println("insert oldPound shillings: ");
		String shilling = scanner.nextLine();
		System.out.println("insert oldPound pennies: ");
		String pennies = scanner.nextLine();
		return new OldPound(Integer.decode(pounds),Integer.decode(shilling),Integer.decode(pennies));

	}
}
