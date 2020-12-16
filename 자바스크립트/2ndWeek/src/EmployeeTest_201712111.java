
public class EmployeeTest_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee_20171211 a1,a2,a3;
		a1=new Employee_20171211("가나", 200);
		a2=new Employee_20171211("다라", 700);
		a3=new Employee_20171211("마바", 330);
		
		int n=Employee_20171211.getCount();
		System.out.println("현재의 직원 수: " +n);
	}

}
