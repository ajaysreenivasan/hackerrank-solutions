package TenDaysOfStatistics;

import java.util.Scanner;

public class Day00_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int elementCount;
		String elementString;
		String[] elementTokens;
		int[] elements;
		String elementFrequencyString;
		String[] elementFrequencyTokens;
		int[] elementFrequency;

		// elementCount = sc.nextInt();
		// sc.nextLine();
		// elementString = sc.nextLine();
		// elementFrequencyString = sc.nextLine();

		elementCount = 10;
		elementString = "10 40 30 50 20 10 40 30 50 20";
		elementFrequencyString = "1 2 3 4 5 6 7 8 9 10";

		elementTokens = elementString.split(" ");
		elementFrequencyTokens = elementFrequencyString.split(" ");

		elements = new int[elementCount];
		elementFrequency = new int[elementCount];

		for (int i = 0; i < elementCount; i++) {
			elements[i] = Integer.parseInt(elementTokens[i]);
			elementFrequency[i] = Integer.parseInt(elementFrequencyTokens[i]);
		}

		System.out.printf("%.1f\n", calculateWeightedMean(elements, elementFrequency));

		sc.close();
	}

	public static double calculateWeightedMean(int[] elements, int[] elementFrequency) {
		double weightedMean = 0;

		double elementSum = 0;
		double frequencySum = 0;

		for (int i = 0; i < elements.length; i++) {
			elementSum += elements[i] * elementFrequency[i];
			frequencySum += elementFrequency[i];
		}

		weightedMean = elementSum / frequencySum;

		return weightedMean;
	}

}
