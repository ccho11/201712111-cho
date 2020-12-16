import java.util.Scanner;

public class DayInMoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		int days = 0;
		
		System.out.println("날수를 알고 싶은 달을 입력하세요. 1부터 12까지만 입력하세요!");
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
		System.out.println("입력한 달 " + month + "월의 날 수는 " + days + "일 입니다.");
	}

}
