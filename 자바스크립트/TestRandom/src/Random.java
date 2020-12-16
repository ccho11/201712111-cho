
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Random generator = new java.util.Random();
		
		int sum = 0;
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Random 하게 발생되는 숫자를 몇 번 반복할까요?");
		
		int count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			sum += generator.nextInt(100);
		}
		
		System.out.println("반복한 횟수는 " + count + "번 이고, 그 누적 합은 " + sum + "입니다.");
	}
}
