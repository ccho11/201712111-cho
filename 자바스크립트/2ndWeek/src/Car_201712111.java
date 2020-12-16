
public class Car_201712111 {

	String color;
	int gear;
	int speed;
	int fuel;
	int dis;
	int fd;
	
	void changeCarGear(int carGear) {
		gear=carGear;
	}
	void carspeedUp() {
		speed=speed+10;
	}
	void carspeedDown() {
		speed=speed-10;
	}
	public String toString() {
		return "이 차의 연비는 " + fuel + "이고 "+ dis +"km를 주행하기 위해서는 " + fd +"L의 연료가 필요하다.";
	}
	void fuel(int a) {
		fuel = a;
	}
	void dis(int a) {
		dis = a;
	}
	void fd(int a,int s) {
		fd = a/s;
	}
}
