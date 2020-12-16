import java.util.Scanner;

public class AvgGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int STUDENTS = 5;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		for (int i = 0; i<scores.length; i++) {
			System.out.println("한명 한명의 성적을 입력하세요");
			
			scores[i] = input.nextInt();
			total += scores[i];
		}
		System.out.println(STUDENTS + " 명의 평균은 " + total/STUDENTS + " 입니다.");
	}

}
