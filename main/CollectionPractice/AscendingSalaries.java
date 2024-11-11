package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AscendingSalaries {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("Ruturaj", "java-dev", 0, 100000.0f, "Pune"));
		l.add(new Employee("Salman", "manager", 1000, 200000000.0f, "London"));
		l.add(new Employee("janardan", "manager", 5, 600000.0f, "US"));
		l.add(new Employee("Akashy", "tester", 4, 90000.0f, "Pune"));
		l.add(new Employee("Harshad", "java-dev", 0, 1000000.0f, "Pune"));
		l.add(new Employee("emp6", "manager", 15, 100007.0f, "delhi"));
		l.add(new Employee("emp7", "python-dev", 0, 100500.0f, "japan"));
		l.add(new Employee("emp8", "cpp-dev", 8, 400000.0f, "qsa"));
		l.add(new Employee("emp9", "tester", 10, 700000.0f, "grdgsfg"));
		l.add(new Employee("emp10", "tester", 0, 900000.0f, "Pune"));
		
		SalaryComparator s = new SalaryComparator();
		Collections.sort(l, s);
		
		Iterator<Employee> i = l.iterator();
		
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.name+" has salary of: "+e.salary);
		}
	}

}
