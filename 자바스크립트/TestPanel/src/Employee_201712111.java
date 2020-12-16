
public class Employee_201712111 {

	String empName;
	double empSalay;
	static int count=0;
	
	Employee_201712111(String n,double s){
		 empName=n;
		 empSalay=s;
		 
		 count++;
	}
	protected void finalize() {
		count--;
	}
	static int getCount() {
		return count;
	}
}
