
public class Employee_20171211 {

	String name;
	double salary;
	static int count=0;
	
	Employee_20171211(String n,double s){
		name=n;
		salary=s;
		 count++;
	}
	protected void finalize() {
		count--;
	}
	static int getCount() {
		return count;
	}
}
