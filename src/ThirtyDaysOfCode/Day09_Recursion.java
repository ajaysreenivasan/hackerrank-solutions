package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day09_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long factorial = calculateFactorial(n);

		System.out.println(factorial);

		sc.close();
	}

	private static long calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * calculateFactorial(n - 1);
	}
}
