package list;

import java.util.ArrayList;
import java.util.HashSet;

public class _7_AddsToTarget {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);

		System.out.println("List: " + l);
		int target = 5;
		System.out.println("target: " + target);

		HashSet<Integer> seen = new HashSet<>();

		for (int i : l) {
			int complement = target - i;
			if (seen.contains(complement)) {
				System.out.println(i + " + " + complement);
			}
			seen.add(i);
		}
	}

}
