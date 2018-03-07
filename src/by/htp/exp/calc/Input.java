package by.htp.exp.calc;

import java.util.Scanner;

public class Input {
	static Scanner mysc = new Scanner(System.in);

	public static double getDoubleNumber() {
		double numberDouble = enterDoubleNumber();
		return numberDouble;
	}
	
	private static double enterDoubleNumber() {
		System.out.println("Введите дробное число:");
		double numberDouble = mysc.nextDouble();
		return numberDouble; 
	}
	
	public static int getIntNumber() {
		int numberInt = enterIntNumber();
		return numberInt;
	}
	
	private static int enterIntNumber() {
		System.out.println("Введите целое число: ");
		int numberInt = mysc.nextInt();
		return numberInt; 
	}
	
	public static String getSymb() {
		String symbol = enterSymb();
		return symbol;
	}
	
	public static String enterSymb() {
		System.out.println("Введите знак операции: ");
		String symbol = mysc.next();
		return symbol; 
	}
}
