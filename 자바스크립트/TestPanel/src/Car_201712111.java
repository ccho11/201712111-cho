
public class Car_201712111 {

	String carColor;
	int carGear1;
	int carSpeed;
	int fuel;
	int dis;
	int fd;
	
	void changeCarGear(int carGear) {
		carGear1=carGear;
	}
	void carSpeedUp() {
		carSpeed=carSpeed+10;
	}
	void carSpeedDown() {
		carSpeed=carSpeed-10;
	}
	public String toString() {
		return "�� ���� ����� "+fuel+"�̰�, "+dis+"km�� �����ϱ� ���ؼ��� "+fd+"L�� ���ᰡ �ʿ��ϴ�.";
	}
	void fuel(int a) {
		fuel= a;
	}
	void dis(int a) {
		dis= a;
	}
	void fd(int a,int s) {
		fd= a/s;
	}
}
