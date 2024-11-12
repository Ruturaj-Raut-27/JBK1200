package map;

import java.util.HashMap;
import java.util.Scanner;

public class _1_PopulateMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		System.out.println("how many numbers you need:");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			System.out.print("Enter the key:");
			int key = sc.nextInt();
			System.out.print("Enter the value:");
			String value = sc.next();
			System.out.println();
			m.put(key, value);
		}

		System.out.println(m);
		sc.close();

	}

}
