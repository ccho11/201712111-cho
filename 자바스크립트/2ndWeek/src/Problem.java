import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("성적을 입력하시오.");
		score = input.nextInt();
		
			if(score >= 95)
				System.out.println("A+");
			else if(score >= 90)
				System.out.println("A");
			else if(score >= 85)
				System.out.println("B+");
			else if(score >= 80)
				System.out.println("B");
			else if(score >= 75)
				System.out.println("C+");
			else if(score >= 70)
				System.out.println("C");
			else if(score >= 65)
				System.out.println("D+");
			else if(score >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		}while(score !=0);
		System.out.println("성적평가 종료");
		
	}

}
