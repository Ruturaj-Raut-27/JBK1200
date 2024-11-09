package list;

import java.util.*;

public class _10_RemovePaliString {

	public static boolean check(String str) {
		int n = str.length();

		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("aba");
		l.add("abc");
		l.add("bab");
		l.add("aaf");
		l.add("mmm");
		System.out.println(l);

		Iterator<String> abc = l.iterator();

		while (abc.hasNext()) {
			String temp = abc.next();
			if (check(temp)) {
				abc.remove();
			}
		}
		System.out.println(l);
	}
}
