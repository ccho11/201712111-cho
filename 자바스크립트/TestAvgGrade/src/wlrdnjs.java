
public class wlrdnjs {

	String name;
	double salary;
	static int count=0;
	
	wlrdnjs(String n, double s) {
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
