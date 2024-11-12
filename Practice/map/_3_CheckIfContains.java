package map;

import java.util.HashMap;
import java.util.Scanner;

public class _3_CheckIfContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "abc");
		m.put(2, "def");
		m.put(3, "ghi");
		m.put(4, "jkl");
		m.put(5, "mno");

		try {
			int choice = 0;
			while (choice != 3) {
				System.out.println("What do you want to check");
				System.out.println("1. Key");
				System.out.println("2. value");
				System.out.println("3. end");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter key to check:");
					int key = sc.nextInt();
					if (m.containsKey(key)) {
						System.out.println(key + " is present in map");
					} else {
						System.out.println(key + " is not present in map");
					}
					break;
				case 2:
					System.out.println("Enter value to check:");
					String value = sc.next();
					if (m.containsValue(value)) {
						System.out.println(value + "is present in map");
					} else {
						System.out.println(value + " is not present in map");
					}
					break;
				case 3:
					break;
				default:
					System.out.println("wrong input enter between 1 - 3.");
				}
			}
		} catch (Exception e) {

			System.out.println("Something went wrong");
		}

		finally {
			sc.close();
		}
	}
}
