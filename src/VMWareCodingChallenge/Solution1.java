package VMWareCodingChallenge;

public class Solution1 {
	public static int maxDifference(int[] a) {
		int difference = 0;
		int maxDifference = 0;

		int curLowestIndex = 0;
		int curHighestIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[curLowestIndex] && i < curHighestIndex) {
				curLowestIndex = i;
			}
			if (a[i] > a[curHighestIndex] && i > curLowestIndex) {
				curHighestIndex = i;
			}

			difference = a[curHighestIndex] - a[curLowestIndex];
			if (maxDifference < difference) {
				maxDifference = difference;
			}
		}

		return maxDifference;
	}
}
