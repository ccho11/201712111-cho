import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14; // PI는 변하지 않음
		double radius; // 원의 반지름
		double area; // 원의 면적
		
		System.out.println("원의 반지름을 입력하세요.");
		
		Scanner input = new Scanner(System.in); 
		// system in = keyboard
		// system out = monitor
		
		radius  = input.nextDouble();
		
		area = PI * radius * radius;
		
		System.out.println("반지름이 " + radius + " 인 원의 면적은 " + area + " 입니다." );
	}

}
