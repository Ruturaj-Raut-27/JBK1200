package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapAccNo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(4738, "SavingsAccount");
		m.put(7453, "CurrentAccount");
		m.put(2537, "myAccount");
		m.put(9139, "combinedAccount");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> abc = s.iterator();
		
		System.out.println("Account numbers are:");
		while(abc.hasNext()) {
			System.out.println(abc.next());
		}

	}

}
