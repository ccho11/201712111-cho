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
		System.out.println("입력 숫자는 1부터 100까지 입력하세요.");
		do {
			guess = input.nextInt();
			tries++;
			if(guess > answer)System.out.println("더 작은 수를  추측하세요.");
			if(guess < answer)System.out.println("더 큰 수를 추측하세요.");
		}while(guess != answer);
		System.out.println("이번에는 " + tries + "번 만에 맞췄습니다.");
	}

}
