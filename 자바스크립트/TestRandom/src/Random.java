
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Random generator = new java.util.Random();
		
		int sum = 0;
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Random �ϰ� �߻��Ǵ� ���ڸ� �� �� �ݺ��ұ��?");
		
		int count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			sum += generator.nextInt(100);
		}
		
		System.out.println("�ݺ��� Ƚ���� " + count + "�� �̰�, �� ���� ���� " + sum + "�Դϴ�.");
	}
}
