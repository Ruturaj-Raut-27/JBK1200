package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FiveMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.println("enter five marks:");
		for (int i = 0; i < 5; i++) {
			a.add(sc.nextInt());
		}
		System.out.println(a);

		Iterator<Integer> abc = a.iterator();
		while (abc.hasNext()) {
			int num = abc.next();
			if (num >= 70 && num <= 90) {
				System.out.println(num);
			}
		}
		
		sc.close();
	}
	
}