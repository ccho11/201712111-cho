import java.util.Random;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		Random d1 = new Random();
		Random d2 = new Random();
		
		System.out.println("��� �ݺ��մϱ�?");
		Scanner order = new Scanner(System.in);
		int count = order.nextInt();
		
		for(int i =0; i<count; i++) {
			
			int dice1;
			int dice2;
			
			dice1 = d1.nextInt(6);
			dice2 = d2.nextInt(6);
			
			sum += dice1;
			sum += dice2;
			
			
		}
		System.out.println("�ݺ��� Ƚ���� " + count + "�� �̰�, ���� " + sum + "�Դϴ�.");
	}

}
