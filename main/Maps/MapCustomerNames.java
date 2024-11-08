package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapCustomerNames {

	public static void main(String[] args) {
		
		HashMap<Integer, Customer> m = new HashMap<Integer, Customer>();
		m.put(1, new Customer("salman", 6473526856l, "Talegaon"));
		m.put(2, new Customer("Ruturaj", 8300624671L, "Akurdi"));
		m.put(3, new Customer("Harshad", 937572847L, "Pimpri"));
		
		Collection<Customer> c = m.values();
		Iterator<Customer> abc = c.iterator();
		
		while(abc.hasNext()) {
			Customer o = abc.next();
			System.out.println(o.name);
		}

	}

}
