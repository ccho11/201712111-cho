import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 0부터 100까지 입력하시오 : ");
		
		score = input.nextInt();
		
		if (score >= 90)
			System.out.println("A 학점");
		else if (score >= 80)
			System.out.println("B 학점");
		else if (score >= 70)
			System.out.println("C 학점");
		else if (score >= 60)	
			System.out.println("D 학점");
		else 
			System.out.println("F 학점");
			
	}

}
