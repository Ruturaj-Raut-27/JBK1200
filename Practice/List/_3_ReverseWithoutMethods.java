package list;

import java.util.ArrayList;

public class _3_ReverseWithoutMethods {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		ArrayList<String> lRev = new ArrayList<String>();
		
		l.add("abc");
		l.add("def");
		l.add("ghi");
		l.add("jkl");
		l.add("mno");
		System.out.println(l);
		
		for (int i = l.size() - 1; i >= 0; i--) {
			lRev.add(l.get(i));
		}
		System.out.println(lRev);
	}
}
