package collectionPractice;

public class Employee {

	public String name;
	public String desg;
	public int exp;
	public float salary;
	public String address;
	
	
	public Employee(String name, String desg, int exp, float salary, String address) {
		this.name = name;
		this.desg = desg;
		this.exp = exp;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [Name=" + name + ", desgignation=" + desg + ", expriance=" + exp + ", salary=" + salary + ", address="
				+ address + "]\n";
	}
	
	

}
