
public class GetMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {20,80,40,17,35,88,10,25,90,77};	
		
		int maximum;
		
		maximum = s[0];
		
		for (int i = 1; i<s.length; i++) {
			if(s[i]<maximum)
				maximum = s[i];
			
		}
		
		System.out.println("배열 요소 중 제일 작은 값은 " + maximum + " 입니다.");
		
		
	}

}
