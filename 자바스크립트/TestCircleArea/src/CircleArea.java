import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14; // PI�� ������ ����
		double radius; // ���� ������
		double area; // ���� ����
		
		System.out.println("���� �������� �Է��ϼ���.");
		
		Scanner input = new Scanner(System.in); 
		// system in = keyboard
		// system out = monitor
		
		radius  = input.nextDouble();
		
		area = PI * radius * radius;
		
		System.out.println("�������� " + radius + " �� ���� ������ " + area + " �Դϴ�." );
	}

}
