package map;

import java.util.HashMap;
import java.util.Scanner;

public class _2_RetriveValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "ABC");
		m.put(2, "DEF");
		m.put(3, "GHI");
		m.put(4, "JKL");
		m.put(5, "MNO");
		System.out.println(m);

		System.out.println("Enter the key:");
		int key = sc.nextInt();
		if (m.containsKey(key)) {
			System.out.println("value: " + m.get(key));
		} else {
			System.out.println(key + " is not in the map.");
		}
		sc.close();

	}

}
