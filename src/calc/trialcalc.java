package calc;

import java.util.Scanner;

public class trialcalc {

	public static void main(String[] args) {
		while (true) {
			Scanner number = new Scanner(System.in);
			System.out.println(" Enter Two numbers: ");

			int first = number.nextInt();
			int second = number.nextInt();

			System.out.println("Enter an operation(+, -, *, /): ");
			char operator = number.next().charAt(0);

			double result = 0;

			switch (operator) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '/':
				result = first / second;
				break;
			case '*':
				result = first * second;
				break;
			default:
				System.out.println("Invalid Operator!! Choose another operator!");
				break;
			}

			System.out.printf ("%d %c %d " + first, operator, second);
			System.out.printf("= %f", result);
			System.out.println(" ");
	}
	}
}
