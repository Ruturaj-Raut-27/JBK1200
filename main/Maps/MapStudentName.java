package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapStudentName {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> m = new HashMap<Integer, Student>();
		m.put(127, new Student("Ruturaj", 23));
		m.put(139, new Student("Salman", 22));
		m.put(143, new Student("Harshad", 23));
		
		Collection<Student> c = m.values();
		Iterator<Student> abc = c.iterator();
		
		System.out.println("name of students:");
		while(abc.hasNext()) {
			Student o = abc.next();
			System.out.println(o.name);
		}

	}

}
