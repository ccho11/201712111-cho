
public class EmployeeTest_201712111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee_201712111 a1, a2;
		a1 = new Employee_201712111("������", 200);
		a2 = new Employee_201712111("�󸶹�", 300);
		
		int n=Employee_201712111.getCount();
		System.out.println("���� �� : " + n + ", ���� ��� ����  : " + ((a1.salary+a2.salary)/n));
		
	}

}
