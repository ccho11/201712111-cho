
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
		return "�� ���� ����� " + fuel + "�̰� "+ dis +"km�� �����ϱ� ���ؼ��� " + fd +"L�� ���ᰡ �ʿ��ϴ�.";
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
