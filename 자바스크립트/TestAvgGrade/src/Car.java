
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
		return "�� ���� ����� " + fuel + "�̰� " + dis + "km�� �����ϱ� ���ؼ��� " + fd +"L�� ���ᰡ �ʿ��ϴ�."; 
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
