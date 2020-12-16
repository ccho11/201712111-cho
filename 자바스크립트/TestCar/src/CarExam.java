
public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.fuel = 20;
		myCar.dis = 300;
		
		
		System.out.println("이 차의 연비는 " + myCar.fuel +"km/l 이고" + myCar.dis + "km를 주행하기 위해서는 " + myCar.CalcFuel(300, 20) + "L의 연료가 필요하다.");
		
	}

}
