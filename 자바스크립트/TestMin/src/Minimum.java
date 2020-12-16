
public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {12,72,40,19,100,28,9,35,46,50};
		
		int maximum = s[0];
		
		for(int i =1; i<s.length; i++) {
			if (s[i] > maximum) maximum = s[i];
			
			
		}
		
		System.out.println("배열의 최대값은 " + maximum + " 이다.");
	}

}
