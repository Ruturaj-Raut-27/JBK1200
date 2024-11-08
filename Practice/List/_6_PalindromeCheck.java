package list;

import java.util.ArrayList;

public class _6_PalindromeCheck {

	public static boolean Check(ArrayList<String> al) {
		if (al.isEmpty()) {
			throw new IllegalArgumentException("The list must not be empty.");
		}
		
		int left = 0;
		int right = al.size() - 1;
		
		while(left < right) {
			if(!al.get(left).equals(al.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("b");
		l.add("a");
		System.out.println(l);
		
		if(Check(l)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
