package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day07_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int elementCount;
		String elementString;
		String[] elementStringTokens;
		Integer[] elements;

		elementCount = sc.nextInt();
		sc.nextLine();
		elementString = sc.nextLine();

		elementStringTokens = elementString.split(" ");
		elements = new Integer[elementCount];
		for (int i = 0; i < elementStringTokens.length; i++) {
			elements[i] = Integer.parseInt(elementStringTokens[i]);
		}

		for (int i = elementCount - 1; i >= 0; i--) {
			System.out.print(elements[i] + " ");
		}

		System.out.println("");

		sc.close();
	}
}
