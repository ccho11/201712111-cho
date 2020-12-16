
public class Employee_201712111 {

	String empName;
	double empSalary;
	static int count=0;
	
	public Employee_201712111(String n, double s) {
		// TODO Auto-generated constructor stub
		empName=n;
		empSalary=s;
		
		count++;
	}
	protected void finalize() {
		count--;
	}
	static int getCount() {
		return count;
	}
}
