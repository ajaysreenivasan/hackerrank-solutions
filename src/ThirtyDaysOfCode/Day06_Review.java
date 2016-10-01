package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day06_Review {
	public static void main(String[] args) {
		int inputStringCount;
		String[] inputStrings;

		Scanner sc = new Scanner(System.in);

		inputStringCount = sc.nextInt();
		sc.nextLine();

		inputStrings = new String[inputStringCount];
		for (int i = 0; i < inputStringCount; i++) {
			inputStrings[i] = sc.nextLine();
		}

		for (String input : inputStrings) {
			printSplit(input);
		}

		sc.close();
	}

	private static void printSplit(String input) {
		for (int i = 0; i < input.length(); i += 2) {
			System.out.print(input.charAt(i));
		}

		System.out.print(" ");

		for (int i = 1; i < input.length(); i += 2) {
			System.out.print(input.charAt(i));
		}

		System.out.println("");
	}

}
