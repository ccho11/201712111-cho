
public class Car {

	int fd;
	int dis;
	int fuel;
	int gear;
	int speed;
	String color;
	
	public String toString() {
		return "�� ���� ����� " + fuel + "�̰� " + dis + "km�� �����ϱ� ���ؼ��� " + fd + "L�� ���ᰡ �ʿ��ϴ�.";
		
	}
	 void fd(int a,int s) {
		 fd= a/s;
	 }
	 void dis(int a) {
		 dis = a;
	 }
	 void fuel(int a) {
		 fuel = a;
	 }
	 void changeCarGear(int carGear) {
		 gear = carGear;
	 }
	 void carSpeedUp() {
		 speed = speed+10;
	 }
	 void carSpeedDown() {
		 speed = speed-10;
	 }
}
