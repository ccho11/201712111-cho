
public class Car_201712111 {

	
	String carColor;
	int carGear;
	int carSpeed;
	int dis;
	int fuel;
	int fd;
	
	void changeCarGear(int carGear) {
		carGear = carGear;
	}
	void carSpeedUp() {
		carSpeed = carSpeed+10;
	}
	void carSpeedDown() {
		carSpeed = carSpeed-10;
	}
	
	public String toString() {
		return "�� ���� ����� " +fuel + "�̰�, "+ dis + "km�� �����ϱ� ���ؼ��� " +fd+ "L�� ���ᰡ �ʿ��ϴ�." ;
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
