
public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.fuel = 20;
		myCar.dis = 300;
		
		
		System.out.println("�� ���� ����� " + myCar.fuel +"km/l �̰�" + myCar.dis + "km�� �����ϱ� ���ؼ��� " + myCar.CalcFuel(300, 20) + "L�� ���ᰡ �ʿ��ϴ�.");
		
	}

}
