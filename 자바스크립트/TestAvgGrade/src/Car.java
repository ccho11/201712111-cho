
public class Car {

	String color;
	int gear;
	int speed;
	int dis;
	int fuel;
	int fd;
	
	void changeCarGear(int carGear) {
		gear = carGear;
	}
	void carSpeedUp() {
		speed=speed+5;
	}
	void carSpeedDown() {
		speed=speed-5;
	}
	public String toString() {
		return "이 차의 연비는 " + fuel + "이고 " + dis + "km를 주행하기 위해서는 " + fd +"L의 연료가 필요하다."; 
	}
	void dis(int a) {
		dis=a;
	}
	void fuel(int a) {
		fuel=a;
	}
	void fd(int a,int s) {
		fd=a/s;
	}
}
