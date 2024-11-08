package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapAccInfo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(4738, "SavingsAccount");
		m.put(7453, "CurrentAccount");
		m.put(2537, "myAccount");
		m.put(9139, "combinedAccount");
		
		Collection<String> s = m.values();
		Iterator<String> abc = s.iterator();
		
		System.out.println("Accounts are:");
		while(abc.hasNext()) {
			System.out.println(abc.next());
		}

	}

}
