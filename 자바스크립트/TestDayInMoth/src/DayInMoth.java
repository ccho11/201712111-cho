import java.util.Scanner;

public class DayInMoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		int days = 0;
		
		System.out.println("������ �˰� ���� ���� �Է��ϼ���. 1���� 12������ �Է��ϼ���!");
		Scanner input = new Scanner(System.in);
		
		month = input.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
		default:
			days = 31;
			break;
		}
		System.out.println("�Է��� �� " + month + "���� �� ���� " + days + "�� �Դϴ�.");
	}

}
