package JobCodingChallenge;

public class Solution {
	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 1 };
		int k = 4;

		System.out.println(maxLength(a, k));
	}

	static int maxLength(int[] a, int k) {
		int maxLength = 0;
		int curLength = 0;
		int curSum = 0;

		// maintain start index of current subarray
		int curSubArrayStart = 0;

		for (int i = 0; i < a.length; i++) {
			if (curSum + a[i] > k) {
				// update maxLength
				if (maxLength <= curLength) {
					maxLength = curLength;
				}

				// if the running total is over k
				// subtract elements from the start
				// of the subarray until the curSum
				// plus the current element is <= k
				while (curSum + a[i] > k && curSubArrayStart <= i) {
					curSum -= a[curSubArrayStart];
					curSubArrayStart += 1;
					curLength -= 1;
				}
			}

			curSum += a[i]; // while the running total < k, add new element
			curLength += 1; // and increment running length
		}

		// final check for new maxLength
		if (maxLength <= curLength) {
			maxLength = curLength;
		}

		return maxLength;
	}
}
