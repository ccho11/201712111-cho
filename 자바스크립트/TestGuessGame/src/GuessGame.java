import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		
		int answer = generator.nextInt(100);
		int guess;
		int tries=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Է� ���ڴ� 1���� 100���� �Է��ϼ���.");
		do {
			guess = input.nextInt();
			tries++;
			if(guess > answer)System.out.println("�� ���� ����  �����ϼ���.");
			if(guess < answer)System.out.println("�� ū ���� �����ϼ���.");
		}while(guess != answer);
		System.out.println("�̹����� " + tries + "�� ���� ������ϴ�.");
	}

}
