package map;

import java.util.HashMap;
import java.util.Scanner;

public class _4_UpdateValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "abc");
		m.put(2, "def");
		m.put(3, "ghi");
		m.put(4, "jkl");
		m.put(5, "mno");
		System.out.println(m);
		
		System.out.println("\nEnter key of value which you want to update:");
		int key = sc.nextInt();
		
		if(m.containsKey(key)) {
			System.out.println("Enter new value:");
			String newVal = sc.next();
			m.replace(key, newVal);
		}
		else {
			System.out.println(key+" is not present in map");
		}
		System.out.println("\n"+m);
		sc.close();
	}

}
