package TenDaysOfStatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Day00_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arraySize;
		String inputArray;
		String[] inputTokens;
		int[] input;

		arraySize = sc.nextInt();
		sc.nextLine();
		inputArray = sc.nextLine();

		inputTokens = inputArray.split(" ");

		input = new int[arraySize];

		/*
		 * Parse the string tokens into integers.
		 * Sort the input into ascending order.
		 */
		for (int i = 0; i < inputTokens.length; i++) {
			input[i] = Integer.parseInt(inputTokens[i]);
		}
		Arrays.sort(input);

		printMean(input);
		printMedian(input);
		printMode(input);

		sc.close();
	}

	/* Standard mean calculation */
	public static void printMean(int[] input) {
		double sum = 0;
		for (int i : input) {
			sum += i;
		}

		double mean = sum / input.length;

		System.out.printf("%.1f\n", mean);
	}

	/* Standard median calculation */
	public static void printMedian(int[] input) {
		int inputLength = input.length;

		if (inputLength % 2 == 0) {
			float value1 = (float) input[inputLength / 2 - 1];
			float value2 = (float) input[inputLength / 2];

			float median = (value1 + value2) / 2;

			System.out.printf("%.1f\n", median);
		} else {
			System.out.printf("%.1f\n", input[inputLength / 2 - 1]);
		}
	}

	/* Standard mode calculation */
	public static void printMode(int[] input) {
		HashMap<Integer, Integer> inputFrequency = new HashMap<>();

		for (int i : input) {
			if (!inputFrequency.containsKey(i)) {
				inputFrequency.put(i, 0);
			}

			inputFrequency.put(i, inputFrequency.get(i) + 1);
		}

		// initialize the max frequency and value 
		int maxFrequencyValue = input[0];
		int maxFrequency = inputFrequency.get(maxFrequencyValue);
		
		// update the values 
		for (int i : inputFrequency.keySet()) {
			if (inputFrequency.get(i) == maxFrequency) {
				if (i < maxFrequencyValue) {
					maxFrequencyValue = i;
					maxFrequency = inputFrequency.get(i);
				}
			} else if (inputFrequency.get(i) > maxFrequency) {
				maxFrequencyValue = i;
				maxFrequency = inputFrequency.get(i);
			}
		}

		System.out.println(maxFrequencyValue);
	}
}
