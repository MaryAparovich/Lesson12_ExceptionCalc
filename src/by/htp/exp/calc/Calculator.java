package by.htp.exp.calc;

import java.util.InputMismatchException;

public class Calculator {

	public void getIntValue() throws NotExistingOperationException {
		int a = Input.getIntNumber();
		int b = Input.getIntNumber();
		String symbol = Input.getSymb();

		checkSymb(symbol);
		if (symbol.equals("+")) {
			System.out.println(a + b);
		} else if (symbol.equals("-")) {
			System.out.println(a - b);
		} else if (symbol.equals("*")) {
			System.out.println(a * b);
		} else if (symbol.equals("/")) {
			System.out.println(a / b);
		}
	}

	public void intValue() {
		try {
			getIntValue();
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль невозможно!");
			intValue();
		} catch (InputMismatchException e) {
			System.out.println("Неверный тип. Введите целое число.");
			Input.mysc.nextLine();
			intValue();
		} catch (NotExistingOperationException e) {
			System.out.println(e.getMessage());
			intValue();
		}
	}

	public void getDoubleValue() throws NotExistingOperationException {
		double c = Input.getDoubleNumber();
		double d = Input.getDoubleNumber();
		String symbol = Input.getSymb();

		checkSymb(symbol);
		System.out.println(c + " " + symbol + " " + d);
	}

	public void doubleValue() {
		try {
			getDoubleValue();
		} catch (InputMismatchException e) {
			System.out.println("Неверный тип. Введите дробное число.");
			Input.mysc.nextLine();
			doubleValue();
		} catch (NotExistingOperationException e) {
			System.out.println(e.getMessage());
			doubleValue();
		}
	}

	private void checkSymb(String symbol) throws NotExistingOperationException {
		if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
		} else {
			throw new NotExistingOperationException("Такой операции не существует!");
		}
	}
}
