package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintWithVowles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();

		System.out.println("Enter 10 names:");
		for (int i = 0; i < 10; i++) {
			a.add(sc.next());
		}
		System.out.println(a);

		Iterator<String> abc = a.iterator();

		while (abc.hasNext()) {
			String str = abc.next().toString();
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					count++;
				}
			}
			if (count == 3) {
				System.out.println(str);
			}
		}
		sc.close();

	}

}
