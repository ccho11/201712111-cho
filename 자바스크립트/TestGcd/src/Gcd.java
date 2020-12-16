import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,r;
		
		System.out.println("큰 수, 작은 수 2개의 숫자를 입력하시오.");
		
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
		
		System.out.println("두 개의 숫자" + large + " 와 " + small + " 에 대한 최대공약수는 " + x + "이다." );
	}

}
