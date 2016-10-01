package ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Scanner;

public class Day08_Dictionaries {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> directory = new HashMap<>();

		int entryCount = sc.nextInt();
		for (int i = 0; i < entryCount; i++) {
			String name = sc.next();
			int phone = sc.nextInt();

			directory.put(name, phone);
		}

		while (sc.hasNext()) {
			String searchQuery = sc.next();

			if (!directory.containsKey(searchQuery)) {
				System.out.println("Not found");
			} else {
				System.out.println(searchQuery + "=" + directory.get(searchQuery));
			}

		}

		sc.close();
	}
}
