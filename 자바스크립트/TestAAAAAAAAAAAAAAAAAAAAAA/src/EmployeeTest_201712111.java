
public class EmployeeTest_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee_201712111 a1, a2;
		a1 = new Employee_201712111("가나다", 200);
		a2 = new Employee_201712111("라마바", 300);
		
		int n=Employee_201712111.getCount();
		System.out.println("직원 수 : " + n + ", 직원 평균 월급  : " + ((a1.salary+a2.salary)/n));
		
	}

}
