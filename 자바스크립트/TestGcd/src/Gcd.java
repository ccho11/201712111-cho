import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,r;
		
		System.out.println("ū ��, ���� �� 2���� ���ڸ� �Է��Ͻÿ�.");
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		int large = x;
		y = input.nextInt();
		int small = y;
/*
		while(y !=0){
			r = x % y;
			x = y;
			y = r;	
*/
		do{
			r = x % y;
			x = y;
			y = r;
		} while(y !=0);
		
		System.out.println("�� ���� ����" + large + " �� " + small + " �� ���� �ִ������� " + x + "�̴�." );
	}

}
